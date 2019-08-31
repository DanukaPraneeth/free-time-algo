import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RockScissorPaperGameTest {

    private RockScissorPaperGame game;

    @Before
    public void setup(){
        game = new RockScissorPaperGame();
    }

    @Test
    public void test_getMaximumScore_for_validInputs(){

        String sample1 = "RSPRS";
        String sample2 = "SRR";
        String sample3 = "PRPRRPP";
        String sample4 = "PPPPRRRSSSSS";

        assertEquals(6, game.getMaximumScore(sample1));
        assertEquals(4, game.getMaximumScore(sample2));
        assertEquals(10, game.getMaximumScore(sample3));
        assertEquals(13, game.getMaximumScore(sample4));

    }


}