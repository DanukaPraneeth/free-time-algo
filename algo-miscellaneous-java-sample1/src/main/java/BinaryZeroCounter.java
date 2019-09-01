public class BinaryZeroCounter {

    public int countMaxMiddleZero(int inputInteger){

        // THis method will return the maximum numbers of consecutive zeros in between the leading and last 1 of a binary number
        // eg :     100001001000 -> 4
        //          100010010000 -> 3

        int tmp = 0;
        int result = 0;
        boolean isZeroWithinBoundry = false;
        boolean isCounterStarted = true;
        boolean repeat = true;
        System.out.println("Binary : " + Integer.toBinaryString(inputInteger));

        while (inputInteger > 0){

            if( ((inputInteger & 1) == 1)){                             // if last digit of current number is 1
                isZeroWithinBoundry = !isZeroWithinBoundry;
                if(result < tmp){
                    result = tmp;
                }

                if(isCounterStarted){                                      // rightmost 1 is found
                    isCounterStarted = false;
                }

                if(repeat)
                    repeat = false;
                else{
                    inputInteger <<=1;
                    repeat = true;
                }

                tmp = 0;
            }
            if(isZeroWithinBoundry && ((inputInteger & 1) == 0)){     // if the rightmost 1 is found and current last digit is 0
                tmp ++;
            }
            //System.out.println(N + " >> " + Integer.toBinaryString(N));
            inputInteger >>=1;
        }
        return result;
    }

}
