package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    public String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {

        return new String[]{board[0][value],board[1][value],board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        if (board[rowIndex][0] ==  board[rowIndex][1] && board[rowIndex][1] == board[rowIndex][2]) {

            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        if (board[0][columnIndex] ==  board[1][columnIndex] && board[1][columnIndex] == board[2][columnIndex]) {

            return true;
        }
        return false;
    }

    public String getWinner() {

        for(int i = 0; i < 3; i++) {
            if (isColumnHomogeneous(i)) {
                return board[0][i];
            }
            if (isRowHomogenous(i)) {
                return board[i][0];
            }
        }
        if(board[0][0].equals(board[1][1]) && (board[1][1].equals(board[2][2]))) {
            return board[0][0];
        }   else if(board[0][2].equals(board[1][1]) && (board[1][1].equals(board[2][0]))) {
            return board[0][2];
        }
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
