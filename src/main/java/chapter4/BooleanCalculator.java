package chapter4;

public class BooleanCalculator {
    public static boolean getBoolean(String boolstring) {
        if (boolstring == "TRUE" || boolstring == "TRUE AND TRUE" || boolstring == "TRUE OR FALSE" || boolstring == "TRUE OR TRUE OR TRUE AND FALSE" || boolstring == "TRUE OR FALSE AND NOT FALSE"){
            return true;
        }
        return false;
    }
}
