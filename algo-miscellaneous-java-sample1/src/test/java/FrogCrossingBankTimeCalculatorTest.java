import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogCrossingBankTimeCalculatorTest {

    private FrogCrossingBankTimeCalculator timeCalculator;

    @Before
    public void setup(){
        timeCalculator = new FrogCrossingBankTimeCalculator();
    }

    @Test
    public void test_MinTimeToCrossRiverCalculation_with_validInputs() {
        int[] sample1 = {1,3,1,4,2,3,5,4};
        int stepCount1 = 5;

        assertEquals(6, timeCalculator.getMinTimeToCrossRiver(stepCount1, sample1));

    }
}