

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TimeZoneConversion {


    /**
     *
     * @param
     * @return
     *   This method reads the time in ISO format (2019-10-10T10:00:00+04:00Z)
     *   Convert time to the server's timezone and return in TIMESTAMP format to be stored in mysql
     *
     */
    public String convertISOTimeToServerTime(String inputDate) {


        String regex = "Z";
        inputDate = inputDate.replaceAll(regex,"");

        DateTimeFormatter inputDateFormat = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ssXXXXX");
        DateTimeFormatter outputDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZoneOffset localTimeZoneOffset = ZoneOffset.systemDefault().getRules().getOffset(Instant.now());

        OffsetDateTime timeAtInputOffset = OffsetDateTime.parse(inputDate, inputDateFormat);
        OffsetDateTime timeAtLocalOffset = timeAtInputOffset.withOffsetSameInstant(localTimeZoneOffset);

        return timeAtLocalOffset.format(outputDateFormat);

    }


    public String convertISOTimeToRequiredTime(String inputDate) {


        String regex = "Z";
        inputDate = inputDate.replaceAll(regex,"");

        DateTimeFormatter inputDateFormat = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ssXXXXX");
        DateTimeFormatter outputDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        OffsetDateTime timeAtInputOffset = OffsetDateTime.parse(inputDate, inputDateFormat);
        OffsetDateTime timeAtRequiredOffset = timeAtInputOffset.withOffsetSameInstant(ZoneOffset.ofHoursMinutes(10, 30));

        return timeAtRequiredOffset.format(outputDateFormat);

    }



}
