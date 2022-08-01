package chapter3;

import java.text.DecimalFormat;

public class StatCalculator {

    public int minimumValue(int[] numArray){
        int value = numArray[0];
        for (int j : numArray) {
            if (j < value) {
                value = j;
            }
        }
        return value;
    }

    public int maximumValue(int[] numArray) {
        int maxValue = numArray[0];
        for (int j : numArray) {

            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue;
    }

    public int numElement(int[] numArray) {
        int count = 0;

        for (int i = 0; i < numArray.length; i++) {
            count++;
        }
        return count;
    }

    public String numAverage(int[] numArray) {
        int count = 0;
        double sum = 0;

        for (int j : numArray) {
            sum += j;
            count++;
        }

        DecimalFormat df = new DecimalFormat("###.######");
        return df.format(sum/count);

    }

}
