package chapter4;
import java.util.Stack;

public class PrimeFactor {
    public Stack<Integer> getPrimeFactor(int number) {
        Stack<Integer> primeFactors = new Stack<>();
        int[] factor = {2, 3, 5};

            for (int value: factor){
                while(number % value == 0){
                    primeFactors.push(value);
                    number = number / value;
                }
            }

        return primeFactors;
    }
}
