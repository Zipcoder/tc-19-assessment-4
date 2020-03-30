package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    SCISSOR("ROCK", "PAPER"),
    ROCK("PAPER", "SCISSOR"),
    PAPER("SCISSOR", "ROCK");

    public final String winner;
    public final String loser;

    RockPaperScissorHandSign(String winner, String loser ) {
        this.winner = winner;
        this.loser = loser;

    }

    public RockPaperScissorHandSign getWinner() {
        return valueOf(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return valueOf(loser);
    }
}
