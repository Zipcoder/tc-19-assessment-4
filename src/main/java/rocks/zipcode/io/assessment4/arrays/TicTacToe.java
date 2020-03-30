package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] ticTacToeBoard;

    public TicTacToe(String[][] board) {
        this.ticTacToeBoard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] result = new String[3];
        for (Integer i = 0; i < 3; i++) {
            result[i] = ticTacToeBoard[value][i];
        }
        return result;
    }

    public String[] getColumn(Integer value) {
        String[] result = new String[3];
        for (Integer i = 0; i < 3; i++) {
            result[i] = ticTacToeBoard[i][value];
        }
        return result;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        return ticTacToeBoard[rowIndex][0] == ticTacToeBoard[rowIndex][1] && ticTacToeBoard[rowIndex][1] == ticTacToeBoard[rowIndex][2];
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        return ticTacToeBoard[0][columnIndex] == ticTacToeBoard[1][columnIndex] && ticTacToeBoard[1][columnIndex] == ticTacToeBoard[2][columnIndex];
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i) || isColumnHomogeneous(i)) {
                return ticTacToeBoard[i][i];
            }
        }
        if ((ticTacToeBoard[0][0] == ticTacToeBoard[1][1] && ticTacToeBoard[1][1] == ticTacToeBoard[2][2]) || (ticTacToeBoard[0][2] == ticTacToeBoard[1][1] && ticTacToeBoard[1][1] == ticTacToeBoard[2][0])) {
            return ticTacToeBoard[1][1];
        } return "No Winner";
    }

    public String[][] getBoard() {
        return null;
    }
}
