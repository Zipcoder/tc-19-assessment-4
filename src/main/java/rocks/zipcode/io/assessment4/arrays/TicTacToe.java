package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe() {
    }

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public String[] getRow(Integer value) {

        String[] row = new String[3];
        for (int i = 0; i <= 2; i++) {
            row[i] = board[value][i];
        }
        return row;
    }

    public String[] getColumn(Integer value) {

        String[] column = new String[3];
        for (int i = 0; i <= 2; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        if (board[rowIndex][0].equals("X") && board[rowIndex][1].equals("X") && board[rowIndex][2].equals("X") || board[rowIndex][0].equals("O") && board[rowIndex][1].equals("O") && board[rowIndex][2].equals("O")) {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        if (board[0][columnIndex].equals("X") && board[1][columnIndex].equals("X") && board[2][columnIndex].equals("X") || board[0][columnIndex].equals("O") && board[1][columnIndex].equals("O") && board[2][columnIndex].equals("O")) {
            return true;
        }
        return false;
    }

    public String checkDiagonal() {

        if (((board[0][0] == "X") && (board[1][1] == "X") && (board[2][2] == "X")) || (board[0][2] == "X") && (board[1][1] == "X") && (board[2][0] == "X")) {
            return "X";
        }

        return "O";
    }

    public String checkVertical() {

        if (((board[0][0] == "X") && (board[0][1] == "X") && (board[0][2] == "X")) || (board[1][0] == "X") && (board[1][1] == "X") && (board[1][2] == "X") || (board[2][0] == "X") && (board[2][1] == "X") && (board[2][2] == "X")) {
            return "X";
        }
        return "O";
    }

    public String checkHorizontal() {

        if (((board[0][0] == "X") && (board[1][0] == "X") && (board[2][0] == "X")) || (board[0][1] == "X") && (board[1][1] == "X") && (board[2][1] == "X") || (board[0][2] == "X") && (board[1][2] == "X") && (board[2][2] == "X")) {
            return "X";
        }

        return "O";
    }
    public String getWinner() {

        if (checkDiagonal() == "X" || checkHorizontal() == "X" || checkVertical() == "X"){
            return "X";
        }
        return "O";
    }

    public String[][] getBoard() {

        return this.board;
    }
}
