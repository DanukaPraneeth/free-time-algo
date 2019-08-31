import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CityAppealCalculatorTest {

    private CityAppealCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new CityAppealCalculator();
    }

    @Test
    public void test_getCityAppeal_with_validInputs() {
        int[] input1 = {1,3,-3};
        int[] input2 = {-8,4,0,5,-3,6};

        assertEquals(6, calculator.getCityAppeal(input1));
        assertEquals(14, calculator.getCityAppeal(input2));

    }


}