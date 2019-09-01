public class ArraySplitterWithMinDiff {

    // This method will split an integer array into two parts such that absolute difference of sum of left and right is minimum
    // and return the minimum absolute diff


    public int getMinAbsoluteDiff(int[] A) {

        int min = Integer.MAX_VALUE;
        int leftSum = 0;
        int rightSum = 0;

        for (int a : A){
            rightSum += a;
        }

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];

            int diff = Math.abs(leftSum - rightSum);
            if (diff < min) {
                min = diff;
            }
        }

        return min;
    }

}
