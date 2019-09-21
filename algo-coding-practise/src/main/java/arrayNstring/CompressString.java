package arrayNstring;

public class CompressString {

    public String compressString(String input){

        StringBuilder compressedString = new StringBuilder();
        int tempCount = 0;

        for(int i = 0; i < input.length(); i ++){

            tempCount ++;

            if( (i+1 >= input.length()) ||  (input.charAt(i) != input.charAt(i+1)) ){

                compressedString.append(input.charAt(i));
                compressedString.append(tempCount);
                tempCount = 0;
            }
        }

        return compressedString.length() < input.length() ? compressedString.toString() : input;
    }
}
