package chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTDDTest {

    @Test
    @DisplayName("When the I fizzbuzz any number, then I should get 1 back")
    void shouldFizzBuzzOne() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        assertEquals("1", testFizzBuzz.test(1));
        assertEquals("2", testFizzBuzz.test(2));
        assertEquals("4", testFizzBuzz.test(4));
    }

    @Test
    @DisplayName("When the I fizzbuzz multiples of 3, then I should get Fizz back")
    void shouldFizzBuzzThree() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        assertEquals("Fizz", testFizzBuzz.test(3));
        assertEquals("Fizz", testFizzBuzz.test(6));
        assertEquals("Fizz", testFizzBuzz.test(9));
    }

    @Test
    @DisplayName("When the I fizzbuzz multiples of 5, then I should get Buzz back")
    void shouldFizzBuzzFive() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        assertEquals("Buzz", testFizzBuzz.test(5));
        assertEquals("Buzz", testFizzBuzz.test(10));
        assertEquals("Buzz", testFizzBuzz.test(20));
    }

    @Test
    @DisplayName("When the I fizzbuzz 7, then I should get Whizz back")
    void shouldFizzBuzzSeven() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        assertEquals("Whizz", testFizzBuzz.test(7));
    }

    @Test
    @DisplayName("When the I fizzbuzz 11, then I should get Buzz back")
    void shouldFizzBuzzEleven() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        assertEquals("Bang", testFizzBuzz.test(11));
    }

    @Test
    @DisplayName("When the I fizzbuzz 15, then I should get FizzBuzz back")
    void shouldFizzBuzzThreeAndFive() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(15);
        assertEquals("FizzBuzz", testFizzBuzz.test(15));
    }
    @Test
    @DisplayName("When the I input a number, then I should get the number back")
    void shouldReturnTheNumber() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(43);
        assertEquals("43", testFizzBuzz.test(43));
    }

    @Test
    @DisplayName("When the I input a number, then I should get the number back")
    void shouldNull() {
        FizzBuzzTDD testFizzBuzz = new FizzBuzzTDD();
        testFizzBuzz.test(210);
        assertNull(testFizzBuzz.test(210));
    }
}
