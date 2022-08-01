package chapter2;

public class LeapYear {
    public boolean test(int i) {
        if (i % 4 == 0 && i % 100 == 0 && i % 400 == 0) {
            return true;
        }
        return false;
    }
}
