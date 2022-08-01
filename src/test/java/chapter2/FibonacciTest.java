package chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    @DisplayName("Generate a Fibonacci sequence")
    void shouldGenerateSequence() {
        Fibonacci testFibonacci = new Fibonacci();
        assertEquals(34, testFibonacci.test(9));
    }

}
