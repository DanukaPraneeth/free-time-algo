package arrayNstring;

public class StringPermutation {

    public boolean checkIfStringPermutation(String x, String y){

        if(x.length() != y.length())
            return false;

        int[] charArray =new int[128];

        for(int i = 0; i < x.length(); i++){
            int c = (int) x.charAt(i);
            charArray[c] ++;
        }

        for(int j = 0; j < y.length(); j++){
            int c = (int) y.charAt(j);
            charArray[c]--;
            if(charArray[c] < 0)
                return false;
        }
        return true;
    }
}
