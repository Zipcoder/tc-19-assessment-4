package rocks.zipcode.io.assessment4.arrays;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] gameBoard;
    private ArrayList<String> linesToCheck = new ArrayList<>();

    public TicTacToe(String[][] board) {
        this.gameBoard = board;
        this.linesToCheck = new ArrayList<>();
        String topLeft = this.gameBoard[0][0];
        String topRight = this.gameBoard[0][2];
        String topMid = this.gameBoard[0][1];
        String botLeft = this.gameBoard[2][0];
        String botRight = this.gameBoard[2][2];
        String botMid = this.gameBoard[2][1];
        String midLeft = this.gameBoard[1][0];
        String midMid = this.gameBoard[1][1];
        String midRight = this.gameBoard[1][2];
        this.linesToCheck.add(topLeft + topMid + topRight);
        this.linesToCheck.add(midLeft + midMid + midRight);
        this.linesToCheck.add(botLeft + botMid + botRight);
        this.linesToCheck.add(topLeft + midLeft + botLeft);
        this.linesToCheck.add(topMid + midMid + botMid);
        this.linesToCheck.add(topRight + midRight + botRight);
        this.linesToCheck.add(topLeft + midMid + botRight);
        this.linesToCheck.add(botLeft + midMid + topRight);
    }

    public TicTacToe() {}

    public String[] getRow(Integer value) {
        String[] output = new String[gameBoard.length];
        for (int i = 0; i < gameBoard.length; i++) {
            output[i] = gameBoard[value][i];
        }
        return output;
    }

    public String[] getColumn(Integer value) {
        String[] output = new String[gameBoard.length];
        for (int i = 0; i < gameBoard.length; i++) {
            output[i] = gameBoard[i][value];
        }
        return output;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return isLineHomogeneous(getRow(rowIndex), rowIndex);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return isLineHomogeneous(getColumn(columnIndex), columnIndex);
    }

    private Boolean isLineHomogeneous(String[] column, Integer columnIndex) {
        String[] col = column;
        if (col.length > 0) {
            String lastString = col[0];
            for (String s : col) {
                if (!s.equals(lastString)) {
                    return false;
                }
                lastString = s;
            }
        }
        return true;
    }

    public String getWinner() {
        for (String line : linesToCheck) {
            if (checkLine(line)) {
                return checkWhichLine(line);
            }
        }
        return "";
    }

    public boolean checkLine(String line) {
        if (line.equals("XXX") || line.equals("OOO")) { return true; }
        return false;
    }

    public String checkWhichLine(String line) {
        if (line.equals("XXX")) { return "X"; }
        else { return "O"; }
    }

    public String[][] getBoard() {
        return gameBoard;
    }
}
