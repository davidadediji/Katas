package chapter4;

public class RomanNumeralShould {

    int[] arabic = { 1, 4, 5, 9, 10, 40, 50,  90, 100, 400, 500, 900, 1000};

    String[] romanLetters = {"I", "IV", "V","IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public String test(int input) {
        StringBuilder roman = new StringBuilder();

        while (input > 0) {
            int maxFound = 0;
            for (int i = 0; i < arabic.length; i++) {
                if (input >= arabic[i]) {
                    maxFound = i;
                }
            }
            input -= arabic[maxFound];
            roman.append(romanLetters[maxFound]);
        }


        return roman.toString();
    }
}


//        if (input == 5){
//            roman.append("V");
//            input -= 5;
//        }
//
//        for (int index = 0; index < input; index++ ){
//
//            roman.append("I");
//
//        }