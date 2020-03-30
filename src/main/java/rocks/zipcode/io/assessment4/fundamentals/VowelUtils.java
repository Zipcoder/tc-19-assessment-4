package rocks.zipcode.io.assessment4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {
        String[] vowels = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
        return Arrays.stream(vowels).parallel().anyMatch(word::contains);
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] ch = word.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            if(isVowel(ch[i])){
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character) ;
        if (character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u')
            return true;
        return false;
    }
}
