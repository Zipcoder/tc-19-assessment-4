package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    ROCK,
    PAPER,
    SCISSOR;


    public RockPaperScissorHandSign getLoser() {
        if (this.equals(RockPaperScissorHandSign.ROCK)) return SCISSOR;
        if (this.equals(RockPaperScissorHandSign.PAPER)) return ROCK;
        if (this.equals(RockPaperScissorHandSign.SCISSOR)) return PAPER;
        return null;
    }

    public RockPaperScissorHandSign getWinner() {
        if (this.equals(RockPaperScissorHandSign.ROCK)) return PAPER;
        if (this.equals(RockPaperScissorHandSign.PAPER)) return SCISSOR;
        if (this.equals(RockPaperScissorHandSign.SCISSOR)) return ROCK;
        return null;
    }
}
