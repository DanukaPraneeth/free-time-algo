package numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    private QuickSort quickSort;
    @Before
    public void setUp() throws Exception {
        quickSort = new QuickSort();
    }

    @Test
    public void test_sort() {

        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;


        quickSort.sort(arr, 0, n-1);

    }
}