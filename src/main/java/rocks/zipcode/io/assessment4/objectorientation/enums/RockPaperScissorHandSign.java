package rocks.zipcode.io.assessment4.objectorientation.enums;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,PAPER,SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        if(this == ROCK)
            return PAPER;
        if(this == PAPER)
            return SCISSOR;
        return ROCK;
    }

    public RockPaperScissorHandSign getLoser() {
        if(this == PAPER)
            return ROCK;
        if(this == SCISSOR)
            return PAPER;
        return SCISSOR;
    }
}
