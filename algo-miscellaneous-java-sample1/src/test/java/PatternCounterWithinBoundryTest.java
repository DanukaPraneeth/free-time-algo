import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternCounterWithinBoundryTest {

    private PatternCounterWithinBoundry patternCounter;

    @Before
    public void setUp() throws Exception {
        patternCounter = new PatternCounterWithinBoundry();
    }

    @Test
    public void test_NumberOfCharactersCounter_WithinEscaped_with_validInputs() {
        String sample1 = "##gh!jcsd#hb!d!bhs#gh!r";
        String sample2 = "##gh!jcsd#hb!d!!bhs!r#gh!r!";

        assertEquals(2, patternCounter.getNumberOfCharactersWithinEscaped(sample1));
        assertEquals(3, patternCounter.getNumberOfCharactersWithinEscaped(sample2));
    }
}