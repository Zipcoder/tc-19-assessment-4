package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = this.board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if (getRow(rowIndex)[0] == "X" && getRow(rowIndex)[1] == "X" && getRow(rowIndex)[2] == "X" ||
                getRow(rowIndex)[0] == "O" && getRow(rowIndex)[1] == "O" && getRow(rowIndex)[2] == "O") {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (getColumn(columnIndex)[0] == "X" && getColumn(columnIndex)[1] == "X" && getColumn(columnIndex)[2] == "X" ||
                getColumn(columnIndex)[0] == "O" && getColumn(columnIndex)[1] == "O" && getColumn(columnIndex)[2] == "O") {
            return true;
        }
        return false;
    }

    public Boolean isDiagonalHomogeneous() {
        if (board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X" ||
                board[0][2] == "X" && board[1][1] == "X" && board[2][0] == "X" ||
                board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O" ||
                board[0][2] == "O" && board[1][1] == "O" && board[2][0] == "O"){
            return true;
        }
        return false;
    }

    public String getWinner() {
        String winner = "";
        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i)){
                winner = getRow(i)[0];
            }
            if (isColumnHomogeneous(i)){
                winner = getColumn(i)[0];
            }
            if (isDiagonalHomogeneous()){
                winner = getColumn(1)[1];
            }
        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
