import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeZoneConversionTest {

    private TimeZoneConversion timeZoneConvertor;

    @Before
    public void setUp() {
        timeZoneConvertor = new TimeZoneConversion();
    }

    @Test
    public void test_convertISOTimeToServerTime() {

        String inputSample = "2019-10-10T10:00:00+04:00Z";
        String expected = "2019-10-10 11:30:00";            // expected output for a server in the zone UTC + 5:30 H

        assertEquals(expected, timeZoneConvertor.convertISOTimeToServerTime(inputSample));
    }

    @Test
    public void test_convertISOTimeToRequiredTime() {

        String inputSample = "2019-10-10T10:00:00+04:00Z";
        String expected = "2019-10-10 16:30:00";            // expected output for a server in the zone UTC + 10:30 H

        assertEquals(expected, timeZoneConvertor.convertISOTimeToRequiredTime(inputSample));
    }
}