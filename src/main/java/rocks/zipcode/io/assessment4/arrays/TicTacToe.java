package rocks.zipcode.io.assessment4.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {}

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                column[i] = board[i][value];
            }
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] oOutcome = {"O","O","O"};
        String[] xOutcome = {"X", "X", "X"};
        String[] r = getRow(rowIndex);

        if (Arrays.equals(r, oOutcome) || Arrays.equals(r, xOutcome)) {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] oOutcome = {"O","O","O"};
        String[] xOutcome = {"X", "X", "X"};
        String[] c = getColumn(columnIndex);

        if (Arrays.equals(c, oOutcome) || Arrays.equals(c, xOutcome)) {
            return true;
        }
        return false;
    }

    public Boolean isDiagonal() {
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        String winner = "";
        for (int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                return board[i][0];
            } else if (isColumnHomogeneous(i)) {
                return board[0][i];
            } else if (isDiagonal()) {
                return board[1][1];
            }
        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
