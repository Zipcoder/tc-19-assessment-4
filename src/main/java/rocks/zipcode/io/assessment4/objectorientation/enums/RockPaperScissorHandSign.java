package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;


    public RockPaperScissorHandSign getWinner() {
        if (this==ROCK){
            return PAPER;
        } else if (this == PAPER){
            return SCISSOR;
        } else if (this == SCISSOR){
            return ROCK;
        }
        return null;
    }


    public RockPaperScissorHandSign getLoser() {
        if (this==ROCK){
            return SCISSOR;
        } else if (this == PAPER){
            return ROCK;
        } else if (this == SCISSOR){
            return PAPER;
        }
        return null;
    }
}
