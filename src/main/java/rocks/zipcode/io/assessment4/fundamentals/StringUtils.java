package rocks.zipcode.io.assessment4.fundamentals;

import java.util.LinkedHashSet;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char character;
        String result = "";
        character = str.charAt(indexToCapitalize);
        result = str.substring(0, indexToCapitalize) + Character.toUpperCase(character) + str.substring(indexToCapitalize + 1, str.length());
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i++) {
            if (baseString.charAt(indexOfString) == characterToCheckFor) {
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        LinkedHashSet<String> temp = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                temp.add(string.substring(i, j));
            }
        }
        return temp.toArray(new String[1]);
    }

    public static Integer getNumberOfSubStrings(String input) {
        return getAllSubStrings(input).length;
    }
}

