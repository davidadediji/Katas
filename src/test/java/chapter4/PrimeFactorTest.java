package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {
    @Test
    void shouldReturn2() {
        PrimeFactor primeFactor = new PrimeFactor();
        assertEquals(factors, primeFactor.test(2));
    }
}
