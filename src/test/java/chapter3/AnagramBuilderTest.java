package chapter3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramBuilderTest {

    @Test
    @DisplayName("Test for one letter")
    public void oneWord(){
        AnagramBuilder builder = new AnagramBuilder();
        List<String> expected = Arrays.asList("a");
        assertEquals(expected, builder.build("a"));

    }

    @Test
    @DisplayName("Test for one letter")
    public void oneWord2(){
        AnagramBuilder builder = new AnagramBuilder();
        List<String> expected = Arrays.asList("b");
        assertEquals(expected, builder.build("b"));

    }
    @Test
    @DisplayName("Test for two letters")
    public void twoWord1(){
        AnagramBuilder builder = new AnagramBuilder();
        List<String> expected = Arrays.asList("ab", "ba");
        assertEquals(expected, builder.build("ab"));

    }
    @Test
    @DisplayName("Test for two letters ")
    public void twoWord2(){
        AnagramBuilder builder = new AnagramBuilder();
        List<String> expected = Arrays.asList("cd", "dc");
        assertEquals(expected, builder.build("cd"));

    }


//    @Test
//    public void threeWord1(){
//        AnagramBuilder builder = new AnagramBuilder();
//
//        List<String> expected = Arrays.asList("car", "cra", "arc", "acr","rac", "rca");
//        assertEquals(expected, builder.build("car"));
//
//    }




    @Test
    public void threeWord1(){
        AnagramBuilder builder = new AnagramBuilder();

        List<String> expected = Arrays.asList("car", "cra", "arc", "acr","rac", "rca");
        assertEquals(expected, builder.build("car"));

    }


}
