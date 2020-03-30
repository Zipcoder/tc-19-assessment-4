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

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] newString = new String[3];
        newString[0] = this.board[0][value];
        newString[1] = this.board[1][value];
        newString[2] = this.board[2][value];
        return newString;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        return (this.board[rowIndex][0] == this.board[rowIndex][1]) && (this.board[rowIndex][1] == this.board[rowIndex][2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] oStatus = {"O", "O", "O"};
        String[] xStatus = {"X", "X", "X"};
        String[] column = getColumn(columnIndex);
        if(Arrays.equals(column, oStatus) || Arrays.equals(column, xStatus)){
            return true;
        }
        return false;
    }

    public Boolean diagonalWinner(){
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])){
            return true;
        }
        else if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
            return true;
        }
        return false;
    }

    public String getWinner() {
        String winner = "";
        for(int i = 0; i < board.length; i++){
            if(isRowHomogenous(i)){
                return board[i][0];
            }
            else if(isColumnHomogeneous((i))){
                return board[0][i];
            }
            else if(diagonalWinner()){
                return board[1][1];
            }
        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}
