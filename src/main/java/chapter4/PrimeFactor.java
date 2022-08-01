package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrimeFactor {
    public Stack<Integer> getPrimeFactor(int number) {
        Stack<Integer> primeFactors = new Stack<>();
        int[] factor = {1, 2, 3, 5};

        for (int value: factor){
            if(number % value == 0){
                primeFactors.push(value);
            }
        }
        return primeFactors;
    }
}
