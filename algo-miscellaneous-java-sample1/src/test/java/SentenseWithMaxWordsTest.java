import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SentenseWithMaxWordsTest {

    private SentenseWithMaxWords counter;

    @Before
    public void setUp() throws Exception {
        counter = new SentenseWithMaxWords();
    }

    @Test
    public void test_MaxWordCount_InSentence_with_validInputs() {
        String sample1 = "We test coders. Give us a try?";
        String sample2 = "Forget  CVs..Save time . x x";
        String sample3 = "This is my first  project! But no one helped me. I am sad";

        assertEquals(4, counter.getMaxWordCountInSentense(sample1));
        assertEquals(2, counter.getMaxWordCountInSentense(sample2));
        assertEquals(5, counter.getMaxWordCountInSentense(sample3));

    }


}