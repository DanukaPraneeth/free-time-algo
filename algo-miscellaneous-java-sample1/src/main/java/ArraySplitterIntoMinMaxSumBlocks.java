public class ArraySplitterIntoMinMaxSumBlocks {

    // The requirement is to split a given array A[] into K blocks such that minimum the highest sum of elements in any block.  M -> largest possible element
    // Output should be largest sum of any block such that it is minimum
    // Question link -     https://codility.com/demo/take-sample-test/min_max_division

    public int getMinimumMaximumSum(int K, int M, int[] A) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < A.length; i++) {    //get the sum as max, and the largest number as min
            max += A[i];
            min = Math.max(min, A[i]);
        }
        int result = max;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (divisionSolvable(mid, K - 1, A)) {
                max = mid - 1;
                result = mid;
            } else {
                min = mid + 1;
            }
        }
        return result;
    }


    private boolean divisionSolvable(int mid, int k, int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > mid) {
                sum = a[i];
                k--;
            }
            if (k < 0) {
                return false;
            }
        }
        return true;
    }

}
