package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    //ADD_ENUMERATIONS_HERE;

    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSOR("SCISSOR");
    String move;

    RockPaperScissorHandSign(String move) {
        this.move = move;
    }

    public RockPaperScissorHandSign getWinner() {

        if (move.equals("ROCK"))
            return PAPER;
        else if(move.equals("PAPER"))
            return SCISSOR;
        else
            return ROCK;
    }


    public RockPaperScissorHandSign getLoser() {

        if (move.equals("ROCK"))
            return SCISSOR;
        else if(move.equals("PAPER"))
            return ROCK;
        else
            return PAPER;
    }
}
