package rocks.zipcode.io.assessment4.fundamentals;

import java.util.*;
import java.util.stream.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder output = new StringBuilder();
        int index = 0;
        for (char c : str.toCharArray()) {
            output.append((index != indexToCapitalize) ? c : Character.toString(c).toUpperCase());
            index++;
        }
        return output.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.length() >= indexOfString) && baseString.charAt(indexOfString) == (characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int k = 1; k <= string.length() - i; k++) {
                substrings.add(string.substring(i, i+k));
            }
        }
        return substrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
