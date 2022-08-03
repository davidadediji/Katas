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

    @Test
    void haveValueTrueAndTrue(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("TRUE AND TRUE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void haveValueTrueOrFalse(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("TRUE OR FALSE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void haveValueFalseOrFalse(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("FALSE OR FALSE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void haveOrAndValue(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("TRUE OR TRUE OR TRUE AND FALSE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void haveOrAndNotValue(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean("TRUE OR FALSE AND NOT FALSE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void haveOrAndParenthesesValue(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean( "(TRUE OR TRUE OR TRUE) AND FALSE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void haveOrAndNotParenthesesValue(){
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = BooleanCalculator.getBoolean( "NOT (TRUE AND TRUE)");
        assertEquals(false, expectedBoolean);
    }
}
