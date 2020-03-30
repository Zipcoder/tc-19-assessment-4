package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() { return (this.toString().equals("ROCK")) ? PAPER : (this.toString().equals("PAPER")) ? SCISSOR : ROCK; }

    public RockPaperScissorHandSign getLoser() { return (this.toString().equals("ROCK")) ? SCISSOR : (this.toString().equals("PAPER")) ? ROCK : PAPER; }
}
