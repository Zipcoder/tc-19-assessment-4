package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board = new String[3][3];

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return new String[]{board[value][0], board[value][1], board[value][2]};
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value], board[1][value], board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return getRow(rowIndex)[0].equals(getRow(rowIndex)[1]) && getRow(rowIndex)[1].equals(getRow(rowIndex)[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return getColumn(columnIndex)[0].equals(getColumn(columnIndex)[1]) && getColumn(columnIndex)[1].equals(getColumn(columnIndex)[2]);
    }

    public Boolean isNWSEDiagonalHomogeneous(String[][] board) {
        return (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]));
    }

    public Boolean isSWNEDiagonalHomogeneous(String[][] board) {
        return (board[2][0].equals(board[1][1]) && board[1][1].equals(board[2][2]));
    }

    public String checkRows(String[][] board) {
        String winner = "no winner";
        for (int i = 0; i <= 2; i++) {
            if (isRowHomogenous(i)) {
                winner = getRow(i)[0];
            }
        }
        return winner;
    }

    public String checkColumns(String[][] board) {
        String winner = "no winner";
        for (int i = 0; i <= 2; i++) {
            if (isColumnHomogeneous(i)) {
                winner = getColumn(i)[0];
            }
        }
        return winner;
    }
    
    public String checkDiagonals(String[][] board){
        String winner = "no winner";
        if (isNWSEDiagonalHomogeneous(board) || isSWNEDiagonalHomogeneous(board)){
            winner = board[1][1];
        }
        return winner;
    }
    


    public String getWinner() {
        if (!checkRows(getBoard()).equals("no winner")){
            return checkRows(getBoard());
            }
        if (!checkColumns(getBoard()).equals("no winner")){
            return checkColumns(getBoard());
        }
        if (!checkDiagonals(getBoard()).equals("no winner")){
            return checkDiagonals(getBoard());
        }
        return "Draw";
    }

    public String[][] getBoard() {
        return board;
    }
}
