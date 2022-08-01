package chapter2;

public class FizzBuzzTDD {
    public String test(int i) {

        if (i >= 1 && i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            } else if (i % 7 == 0) {
                return "Whizz";
            } else if (i % 11 == 0) {
                return "Bang";
            }
            return Integer.toString(i);
        }
        return null;
    }
}
