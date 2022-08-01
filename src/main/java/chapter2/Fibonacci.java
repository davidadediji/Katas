package chapter2;

public class Fibonacci {
    public int test(int position) {

        if (position <= 1){
            return position;
        }

        return test(position -1) + test(position - 2);
    }
}
