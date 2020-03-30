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
        String[] row = new String[3];
        if (value == 0) {
             row[0] = board[0][0];
             row[1] = board[0][1];
             row[2] = board[0][2];
        }
        if (value == 1) {
            row[0] = board[1][0];
            row[1] = board[1][1];
            row[2] = board[1][2];
        }
        if (value == 2) {
            row[0] = board[2][0];
            row[1] = board[2][1];
            row[2] = board[2][2];
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        if (value == 0) {
            column[0] = board[0][0];
            column[1] = board[1][0];
            column[2] = board[2][0];
        }
        if (value == 1) {
            column[0] = board[0][1];
            column[1] = board[1][1];
            column[2] = board[2][1];
        }
        if (value == 2) {
            column[0] = board[0][2];
            column[1] = board[1][2];
            column[2] = board[2][2];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] arr =  getRow(rowIndex);
        return arr[0] == arr[1] && arr[0] == arr[2];
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] arr = getColumn(columnIndex);
        return arr[0] == arr[1] && arr[0] == arr[2];
    }

    public String getWinner() {
        if (board[0][0] == "O" && board[0][1] == "O" && board[0][2] == "O" ||
        board[1][0] == "O" && board[1][1] == "O" && board[1][2] == "O" ||
        board[0][0] == "O" && board[1][0] == "O" && board[2][0] == "O" ||
        board[0][1] == "O" && board[1][1] == "O" && board[2][1] == "O" ||
        board[0][2] == "O" && board[1][2] == "O" && board[2][2] == "O" ||
        board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O" ||
        board[0][2] == "O" && board[1][1] == "O" && board[2][0] == "O" ||
        board[2][0] == "O" && board[2][1] == "O" && board[2][2] == "O"){
            return "O";
        }
        if (board[0][0] == "X" && board[0][1] == "X" && board[0][2] == "X" ||
                board[1][0] == "X" && board[1][1] == "X" && board[1][2] == "X" ||
                board[0][0] == "X" && board[1][0] == "X" && board[2][0] == "X" ||
                board[0][1] == "X" && board[1][1] == "X" && board[2][1] == "X" ||
                board[0][2] == "X" && board[1][2] == "X" && board[2][2] == "X" ||
                board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X" ||
                board[0][2] == "X" && board[1][1] == "X" && board[2][0] == "X" ||
                board[2][0] == "X" && board[2][1] == "X" && board[2][2] == "X"){
        return "X";
        }return null;
    }

    public String[][] getBoard() {
        return board;
    }
}
