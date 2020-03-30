package rocks.zipcode.io.assessment4.fundamentals;

import java.util.*;
import java.util.stream.*;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    private static ArrayList<Character> vowels;

    static {
        vowels = new ArrayList<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    public static Boolean hasVowels(String word) {
        List<Character> chars = word.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        for (Character c : vowels) {
            if (chars.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int index = 0;
        for (char c : word.toCharArray()){
            if (isVowel(c)) {
                return index;
            }
            index++;
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return (character != null) && vowels.contains(character);
    }
}
