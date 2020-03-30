package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[] [] board = new String[2][2];

    public TicTacToe(String[][] board) {
        this.board= board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for(int i = 0; i< 3; i++){
            column[i] = board[i][value];
        }

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {

        return false;
    }

    public String getWinner() {
        String winner = null;
        for(int i = 0; i< 3;i++){
            if(isColumnHomogeneous(i)){
                winner = getColumn(i)[0];
            }if(isRowHomogenous(i)){
                winner = getRow(i)[0];
           }
        }
        return winner;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
