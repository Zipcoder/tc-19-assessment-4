package rocks.zipcode.io.assessment4.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("rock"),
    PAPER("paper"),
    SCISSOR("scissor");

    private String move;

    RockPaperScissorHandSign(String move) {
        this.move = move;
    }

    public RockPaperScissorHandSign getWinner() {
        RockPaperScissorHandSign winner = null;
        switch (move){
            case "rock":
                winner = PAPER;
                break;
            case "paper":
                winner = SCISSOR;
                break;
            case "scissor":
                winner = ROCK;
                break;


        }
        return winner;
    }

    public RockPaperScissorHandSign getLoser() {
        RockPaperScissorHandSign loser = null;
        switch (move){
            case "rock":
                loser = SCISSOR;
                break;
            case "paper":
                loser = ROCK;
                break;
            case "scissor":
                loser = PAPER;
                break;


        }
        return loser;
    }
}
