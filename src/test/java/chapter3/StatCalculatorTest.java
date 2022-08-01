package chapter3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatCalculatorTest {

    int[] numberArray = {6, 9, 15, -2, 92, 11};

    @Test
    void shouldReturnMinimumValue(){
        StatCalculator testStat = new StatCalculator();
        assertEquals(-2, testStat.minimumValue(numberArray));
    }

    @Test
    void shouldReturnMaximumValue(){
        StatCalculator testStat = new StatCalculator();
        assertEquals(92, testStat.maximumValue(numberArray));

    }

    @Test
    void shouldFindNumberOfElement() {
        StatCalculator testStat = new StatCalculator();
        assertEquals(6, testStat.numElement(numberArray));
    }

    @Test
    void shouldFindAverageNumberOfElements() {
        StatCalculator testStat = new StatCalculator();
        assertEquals( "21.833333", testStat.numAverage(numberArray));
    }
}
