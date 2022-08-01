package chapter3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramBuilder {


  public static List<String> build(String a){
      List<String> anagrams = new ArrayList<>();

      if (a.length() <= 1){
          return Arrays.asList(a);
      }

      if (a.length() == 2){
          return Arrays.asList(a, a.substring(1) + a.substring(0,1));
      }

//      if(a.length() == 3){
                anagrams.add(a.substring(0,1) + a.substring(1,2) + a.substring(2));
//          anagrams.add(a.substring(0, 1) + build(a.substring(1,2) + a.substring(2)));
//          anagrams.add(a.substring(0, 1) + build(a.substring(2) + a.substring(1,2)));
//          anagrams.add(a.substring(1, 2) + build(a.substring(0, 1) + a.substring(2)));
//          anagrams.add(a.substring(1, 2) + build(a.substring(2) + a.substring(0,1)));
//          anagrams.add(a.substring(2) + build(a.substring(0, 1) + a.substring(1, 2)));
//          anagrams.add(a.substring(2) + build(a.substring(1,2) + a.substring(0,1)));
//      }
//      return anagrams;




      for (int i = 0; i < a.length(); i++){
          System.out.println(a.substring(i, a.length()-1-i));

      }
      return anagrams;

  }

    public static void main(String[] args) {
        System.out.println(build("car"));
    }



}
