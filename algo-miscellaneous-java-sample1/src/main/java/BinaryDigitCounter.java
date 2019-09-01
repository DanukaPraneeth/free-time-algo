public class BinaryDigitCounter {

    public int getOnesCount(int A, int B) {

        long a = (long) A;
        long b = (long) B;
        long tmp = a * b;

        int counter = 0;

        while (tmp != 0) {

            if (tmp % 2 != 0)
                counter++;

            tmp /= 2;           // THis is same as bitwise operation to remove the last binary digit

        }
        return counter;
    }


    public int getZerosCount(int A) {

        int counter = 0;

        while (A != 0) {

            if (A % 2 == 0)
                counter++;

            A /= 2;

        }
        return counter;

    }
}
