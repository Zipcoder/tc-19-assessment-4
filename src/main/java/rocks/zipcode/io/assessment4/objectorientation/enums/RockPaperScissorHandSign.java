package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSOR("SCISSOR");

    private final String value;

    RockPaperScissorHandSign(String value) {
        this.value = value;
    }

    public RockPaperScissorHandSign getWinner() {
        return (value == "SCISSOR") ? ROCK : (value == "ROCK") ? PAPER : SCISSOR;
    }

    public RockPaperScissorHandSign getLoser() {
        if (value == "SCISSOR") {
            return PAPER;
        }
        else if (value == "ROCK"){
            return SCISSOR;
        }
        else{
            return ROCK;
        }
    }
}
