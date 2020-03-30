package rocks.zipcode.io.assessment4.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;
    private String[] row1;
    private String[] row2;
    private String[] row3;
    private String[] col1;
    private String[] col2;
    private String[] col3;
    private String[] dig1;
    private String[] dig2;
    private String[] winnerX;
    private String[] winnerO;

    public TicTacToe(String[][] board) {
        this.board = board;
        row1 = new String[] {board[0][0], board[0][1], board[0][2]};
        row2 = new String[] { board[1][0], board[1][1], board[1][2]};
        row3 = new String[] {board[2][0], board[2][1], board[2][2]};

        col1 = new String[] {board[0][0], board[1][0], board[2][0]};
        col2 = new String[] {board[0][1], board[1][1], board[2][1]};
        col3 = new String[] {board[0][2], board[1][2], board[2][2]};

        dig1 = new String[] {board[0][0], board[1][1], board[2][2]};
        dig2 = new String[] {board[0][2], board[1][1], board[2][0]};

        winnerX = new String[]{"X","X","X"};
        winnerO = new String[]{"O", "O", "O"};
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        if(value == 0){
            return row1;
        }else if (value == 1){
            return row2;
        }return row3;
    }

    public String[] getColumn(Integer value) {
        if(value == 0){
            return col1;
        }else if(value == 1){
            return col2;
        }return col3;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if (rowIndex == 0){
            return Arrays.equals(row1, winnerX) || Arrays.equals(row1, winnerO);
        }
        if (rowIndex == 1){
            return Arrays.equals(row2, winnerX) || Arrays.equals(row2, winnerO);
        }
        if (rowIndex == 2){
            return Arrays.equals(row3, winnerO) || Arrays.equals(row3, winnerO);
        }
        return  false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (columnIndex == 0){
            return Arrays.equals(col1, winnerX) || Arrays.equals(col1, winnerO);
        }
        if (columnIndex == 1){
            return Arrays.equals(col2, winnerX) || Arrays.equals(col2, winnerO);
        }
        if (columnIndex == 2){
            return Arrays.equals(row3, winnerO) || Arrays.equals(row3, winnerO);
        }
        return  false;
    }

    public String getWinner() {
        if (Arrays.equals(row1, winnerX)) {
            return "X";
        } else if (Arrays.equals(row2, winnerX)) {
            return "X";
        } else if (Arrays.equals(row3, winnerX)) {
            return "X";
        } else if (Arrays.equals(col1, winnerX)) {
            return "X";
        } else if (Arrays.equals(col2, winnerX)) {
            return "X";
        } else if (Arrays.equals(col3, winnerX)) {
            return "X";
        } else if (Arrays.equals(dig1, winnerX)) {
            return "X";
        } else if (Arrays.equals(dig2, winnerX)) {
            return "X";
        } else if (Arrays.equals(row1, winnerO)) {
            return "O";
        } else if (Arrays.equals(row2, winnerO)) {
            return "O";
        } else if (Arrays.equals(row3, winnerO)) {
            return "O";
        } else if (Arrays.equals(col1, winnerO)) {
            return "O";
        } else if (Arrays.equals(col2, winnerO)) {
            return "O";
        } else if (Arrays.equals(dig1, winnerO)) {
            return "O";
        } else if (Arrays.equals(dig2, winnerO)) {
            return "O";
        } else {
            return "O";
        }
    }

    public String[][] getBoard() {
        return board;    }
}
