package chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrimeFactor {
    public Stack<Integer> getPrimeFactor(int number) {
        Stack<Integer> primeFactors = new Stack<>();
        int[] factor = {2, 3, 5};

        for (int i = 2; i < number; i++) {
            if(number % i == 0 && number % 1 == 0){
                    primeFactors.push(i);
                }
//            for (int value: factor){
//                if(number % value == 0){
//                    primeFactors.push(value);
//                }
//            }
        }

        return primeFactors;
    }
}
