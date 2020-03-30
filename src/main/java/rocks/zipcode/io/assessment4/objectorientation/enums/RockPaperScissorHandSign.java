package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    //ADD_ENUMERATIONS_HERE;
   ROCK("ROCK"),
   PAPER ("PAPER"),
   SCISSOR("SCISSOR");

   String handSign;

    RockPaperScissorHandSign(String handSign) {
        this.handSign = handSign;
    }

    public RockPaperScissorHandSign getWinner() {

        if( handSign.equals(("ROCK")))
            return PAPER;
        else if( handSign.equals("PAPER"))
            return SCISSOR;
    else
        return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {

        if( handSign.equals(("ROCK")))
            return SCISSOR;
        else if( handSign.equals("PAPER"))
            return ROCK;
        else
            return PAPER;
    }
}
