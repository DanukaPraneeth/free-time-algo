package numbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    private PrimeNumber primeNumber;
    @Before
    public void setUp() throws Exception {
        primeNumber = new PrimeNumber();
    }

    @Test
    public void test_isPrime() {

        assertEquals(true, primeNumber.isPrime(31));
        assertNotEquals(true, primeNumber.isPrime(8));
    }
}