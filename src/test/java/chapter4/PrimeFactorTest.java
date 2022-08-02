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

    @Test
    void shouldReturnFive() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(5);

        Stack<Integer> actualFactors = new Stack<>();
        actualFactors.push(5);
        assertEquals(actualFactors, expectedFactors);
    }

    @Test
    void shouldReturnSix() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(6);
        Stack<Integer> actualFactors = new Stack<>();
        actualFactors.push(2);
        actualFactors.push(3);
        assertEquals(actualFactors, expectedFactors);
    }

    @Test
    void shouldReturnNine() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(9);
        Stack<Integer> actualFactors = new Stack<>();
        actualFactors.push(3);
        actualFactors.push(3);
        assertEquals(actualFactors, expectedFactors);
    }

    @Test
    void shouldReturnTwelve() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(12);
        Stack<Integer> actualFactors = new Stack<>();
        actualFactors.push(2);
        actualFactors.push(2);
        actualFactors.push(3);
        assertEquals(actualFactors, expectedFactors);
    }
}
