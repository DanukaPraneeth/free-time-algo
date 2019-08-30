import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormaterWithRegex {

    public String[] changeDateFormat( String[] input ) {

        if(input == null)
            throw new IllegalArgumentException("Date cannot be null");

        String[] result = new String[input.length];
        int counter = 0;

        /**
         *
         *  Pattern1 = 2018-10-15   /   2018/10/15
         *  Pattern2 = 15-10-2018   /   15/10/2018
         *
         */

        String regex1 = "(\\d{4})[-/](\\d{2})[-/](\\d{2})";
        String regex2 = "(\\d{2})[-/](\\d{2})[-/](\\d{4})";

        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);


        for(String s : input){

            Matcher match1 = pattern1.matcher(s);
            Matcher match2 = pattern2.matcher(s);

            if(match1.matches()) {
                System.out.println("Input identified with patter 1 : " + s);
                result[counter] = match1.replaceAll("$1$2$3");
            }
            else if(match2.matches()) {
                System.out.println("Input identified with patter 2 : " + s);
                result[counter] = match2.replaceAll("$3$2$1");
            }
            else {
                System.out.println("Input identified without any matching patter : " + s);
                result[counter] = s;
            }
            counter ++;
        }

        return result;

    }
}
