package chapter4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BooleanCalculatorTestShould {
    @Test
    void haveStringValueTrue(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("TRUE");
        assertEquals(true, expectedBoolean);
    }
    @Test
    void haveStringValueFalse(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("FALSE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void haveNotValueTrue(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("NOT TRUE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void haveValueTrueAndFalse(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("TRUE AND FALSE");
        assertEquals(false, expectedBoolean);
    }
}
