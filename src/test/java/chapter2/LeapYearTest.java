package chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    @DisplayName("Returns true or false depending if a year is a leap year or not")
    void shouldBeLeapYear() {
        LeapYear testLeapYear = new LeapYear();
        assertTrue(testLeapYear.test(2000));
    }

    @Test
    @DisplayName("Returns true or false depending if a year is a leap year or not")
    void shouldBeCommonYear() {
        LeapYear testLeapYear = new LeapYear();
        assertFalse(testLeapYear.test(2001));
    }
}
