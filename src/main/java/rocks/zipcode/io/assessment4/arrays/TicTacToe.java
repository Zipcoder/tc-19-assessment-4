package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    String topLeft;
    String topMid;
    String topRight;

    String midLeft;
    String midMid;
    String midRight;

    String botLeft;
    String botMid;
    String botRight;


    public TicTacToe(String[][] board) {
        this.board = board;

        topLeft = board[0][0];
        topMid = board[0][1];
        topRight = board[0][2];

        midLeft = board[1][0];
        midMid = board[1][1];
        midRight = board[1][2];

        botLeft = board[2][0];
        botMid = board[2][1];
        botRight = board[2][2];
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        if (value == 0) return new String[]{topLeft, topMid, topRight};
        else if (value == 1) return new String[]{midLeft, midMid, midRight};
        else return new String[]{botLeft, botMid, botRight};
    }

    public String[] getColumn(Integer value) {
        if (value == 0) {
            return new String[]{topLeft, midLeft, botLeft};
        } else if (value == 1) {
            return new String[]{topMid, midMid, botMid};
        } else
            return new String[]{topRight, midRight, botRight};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0].equals(row[1]) || row[1].equals(row[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return getColumn(columnIndex)[0].equals(getColumn(columnIndex)[1])
                && getColumn(columnIndex)[1].equals(getColumn(columnIndex)[2]);
    }


    public String[][] getBoard() {
        return this.board;
    }


    public Boolean isInFavorOfX() {
        if (topLeft.equals("X") && topLeft.equals(topMid) && topMid.equals(topRight) ||
                midLeft.equals("X") && midLeft.equals(midMid) && midMid.equals(midRight) ||
                botLeft.equals("X") && botLeft.equals(botMid) && botMid.equals(botRight) ||
                topLeft.equals("X") && topLeft.equals(midLeft) && midLeft.equals(botLeft) ||
                topMid.equals("X") && topMid.equals(midMid) && midMid.equals(botMid) ||
                topRight.equals("X") && topRight.equals(midRight) && midRight.equals(botRight) ||
                topLeft.equals("X") && topLeft.equals(midMid) && midMid.equals(botRight) ||
                topRight.equals("X") && topRight.equals(midMid) && midMid.equals(botLeft)) {
            return true;
        }
        return false;
    }


    public Boolean isInFavorOfO() {
        if (topLeft.equals("O") && topLeft.equals(topMid) && topMid.equals(topRight) ||
                midLeft.equals("O") && midLeft.equals(midMid) && midMid.equals(midRight) ||
                botLeft.equals("O") && botLeft.equals(botMid) && botMid.equals(botRight) ||
                topLeft.equals("O") && topLeft.equals(midLeft) && midLeft.equals(botLeft) ||
                topMid.equals("O") && topMid.equals(midMid) && midMid.equals(botMid) ||
                topRight.equals("O") && topRight.equals(midRight) && midRight.equals(botRight) ||
                topLeft.equals("O") && topLeft.equals(midMid) && midMid.equals(botRight) ||
                topRight.equals("O") && topRight.equals(midMid) && midMid.equals(botLeft)) {
            return true;
        }
        return false;
    }


    public String getWinner() {
        String winnerX = "X";
        String winnerO = "O";
        String isDraw = "";

        if (isInFavorOfX()) {
            return winnerX;
        } else if (isInFavorOfO()) {
            return winnerO;
        }
        return isDraw;
    }
}
