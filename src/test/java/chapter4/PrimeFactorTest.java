package chapter4;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {
    @Test
    void shouldReturnEmpty() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(1);
        Stack<Integer> actualFactors = new Stack<>();
        assertEquals(actualFactors, expectedFactors);
    }

    @Test
    void shouldReturnTwo() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(2);
        Stack<Integer> actualFactors = new Stack<>();
        actualFactors.push(2);
        assertEquals(actualFactors, expectedFactors);
    }

    @Test
    void shouldReturnThree() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(3);
        Stack<Integer> actualFactors = new Stack<>();
        actualFactors.push(3);
        assertEquals(actualFactors, expectedFactors);
    }

    @Test
    void shouldReturnFour() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(4);
        Stack<Integer> actualFactors = new Stack<>();
        actualFactors.push(2);
        actualFactors.push(2);
        assertEquals(actualFactors, expectedFactors);
    }
}
