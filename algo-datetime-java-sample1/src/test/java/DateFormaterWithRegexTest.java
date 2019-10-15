import org.junit.Before;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

public class DateFormaterWithRegexTest {

    private DateFormaterWithRegex dateFormater;

    @Before
    public void setUp() {
        dateFormater = new DateFormaterWithRegex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDateTimeFormater_emptyInput_shouldThroughException(){
        String[] sample1 = null;
        String[] expected1 = {"20100330","20161215","20131511","20130720"};

        assertEquals(expected1, dateFormater.changeDateFormat(sample1));
    }

    @Test
    public void testDateTimeFormater_validInput_shouldPass(){
        String[] sample1 = {"2010/03/30","15/12/2016","11-15-2013","20130720"};
        String[] expected1 = {"20100330","20161215","20131511","20130720"};

        assertEquals(expected1, dateFormater.changeDateFormat(sample1));

    }

    @Test
    public void test_md5Sum() throws NoSuchAlgorithmException {
        dateFormater.md5Sum();
    }
}