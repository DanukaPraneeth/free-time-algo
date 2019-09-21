package arrayNstring;

public class ReplaceSpaces {

    public String replaceString( String input, int length){

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < length; i++){
            if(input.charAt(i) == ' ')
                result.append("%20");

            else
                result.append(input.charAt(i));
        }
        return String.valueOf(result);
    }
}
