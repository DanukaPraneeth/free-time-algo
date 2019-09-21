package arrayNstring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMetrixTest {

    private RotateMetrix rotateMetrix;

    @Before
    public void setUp() throws Exception {
        rotateMetrix = new RotateMetrix();
    }

    @Test
    public void rotateMatrix() {

        int[][] input1 = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };

        int[][] output1 = {
                {41, 31, 21, 11},
                {42, 32, 22, 12},
                {43, 33, 23, 13},
                {44, 34, 24, 14}
        };

        assertEquals(output1, rotateMetrix.rotateMatrix(input1));

    }
}