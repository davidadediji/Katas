package chapter4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RomanNumeralTest {
    @Test
    void firstTest(){
        RomanNumeralShould convertTest = new RomanNumeralShould();

        assertEquals("I", convertTest.test(1));
    }

    @Test
    void secondTest(){
        RomanNumeralShould convertTest = new RomanNumeralShould();
        assertEquals("II", convertTest.test(2));
    }

    @Test
    void thirdTest(){
        RomanNumeralShould convertTest = new RomanNumeralShould();
        assertEquals("III", convertTest.test(3));
    }

    @Test
    void fourthTest(){
        RomanNumeralShould convertTest = new RomanNumeralShould();
        assertEquals("IV", convertTest.test(4));
    }

    @Test
    void fiveTest(){
        RomanNumeralShould convertTest = new RomanNumeralShould();
        assertEquals("V", convertTest.test(5));
    }

    @Test
    void sixTest(){
        RomanNumeralShould convertTest = new RomanNumeralShould();
        assertEquals("VI", convertTest.test(6));
    }

    @Test
    void hundredTest(){
        RomanNumeralShould convertTest = new RomanNumeralShould();
        assertEquals("C", convertTest.test(100));
    }
}
