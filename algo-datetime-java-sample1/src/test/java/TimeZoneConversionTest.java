import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeZoneConversionTest {

    private TimeZoneConversion timeZoneConvertor;

    @Before
    public void setUp() throws Exception {
        timeZoneConvertor = new TimeZoneConversion();
    }

    @Test
    public void test_getTimeInServerTimeZone_for_validInputs() {

        String inputSample = "2019-10-10T10:00:00+04:00Z";
        String expected = "2019-10-10 11:30:00";            // expected output for a server in the zone UTC + 5:30 H

        assertEquals(expected, timeZoneConvertor.getTimeInServerTimeZone(inputSample));
    }
}