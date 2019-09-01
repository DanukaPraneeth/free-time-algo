import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJumpCounterTest {

    private FrogJumpCounter jumpCounter;

    @Before
    public void setUp() throws Exception {
        jumpCounter = new FrogJumpCounter();
    }

    @Test
    public void test_MinJumps_with_validInputs() {
        assertEquals(3, jumpCounter.getMinJumps( 10, 85, 30));
        assertEquals(142730189, jumpCounter.getMinJumps( 3, 999111321, 7));
    }
}