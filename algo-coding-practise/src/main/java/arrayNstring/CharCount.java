package arrayNstring;

public class CharCount {


    public boolean checkforUnique(String input){


        if(input.length() > 128)
            return false;
        boolean[] charList = new boolean[128];

        for(int i = 0; i < input.length(); i++) {
            int charVal = input.charAt(i);

            if (!charList[charVal])
                charList[charVal] = true;

            else
                return false;
        }
        return true;

    }


}
