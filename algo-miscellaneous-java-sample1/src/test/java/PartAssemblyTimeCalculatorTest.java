import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PartAssemblyTimeCalculatorTest {

    private PartAssemblyTimeCalculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new PartAssemblyTimeCalculator();
    }

    @Test
    public void test_minimumAssemblyTimeCalculation_with_validInputs() {
        int partCount = 4;
        ArrayList<Integer> listOfIndividualAssemblyTimes = new ArrayList<Integer>();
        listOfIndividualAssemblyTimes.add(8);
        listOfIndividualAssemblyTimes.add(4);
        listOfIndividualAssemblyTimes.add(6);
        listOfIndividualAssemblyTimes.add(12);
        assertEquals(58, calculator.getMinimumAssemblyTime(partCount,listOfIndividualAssemblyTimes));
    }
}