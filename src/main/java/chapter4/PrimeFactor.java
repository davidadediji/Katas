package chapter4;

import java.util.Stack;

public class PrimeFactor {
    public Stack<Integer> getPrimeFactor(int number) {
        Stack<Integer> primeFactors = new Stack<>();
        if(number == 2){
            primeFactors.push(number);
        }
        if(number == 3){
            primeFactors.push(number);
        }
        if(number == 4){
            primeFactors.push(2);
            primeFactors.push(2);
        }
        return primeFactors;
    }
}
