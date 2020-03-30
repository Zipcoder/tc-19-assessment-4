package rocks.zipcode.io.assessment4.arrays;

import java.util.Arrays;
import java.util.List;

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

        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for (int i = 0; i < 3; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        List<String> list = Arrays.asList(getRow(rowIndex));
        return list.stream().distinct().limit(2).count() <=1;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        List<String> list = Arrays.asList(getColumn(columnIndex));
        return list.stream().distinct().limit(2).count() <=1;
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if(isRowHomogenous(i)){
                return getRow(i)[0];
            }
            else if(isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
            else if( ( (board[0][0].equals(board[1][1])) && (board[0][0].equals(board[2][2])) )
            || ((board[0][2].equals(board[1][1]) && (board[1][1].equals(board[2][0]))))){
                return board[1][1];
            }
        }
            return null;
    }

    public String[][] getBoard() {

        return board;
    }
}
