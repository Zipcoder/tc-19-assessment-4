package rocks.zipcode.io.assessment4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        String[] strArray = str.split("");
        strArray[indexToCapitalize] = strArray[indexToCapitalize].toUpperCase();
        return String.join("", strArray);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        return baseString.charAt(indexOfString)==(characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {

        Set<String> result = new HashSet<String>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                result.add(string.substring(i, j));
            }
        }
            String [] toReturn = new String[result.size()];
            return result.toArray(toReturn);
    }

    public static Integer getNumberOfSubStrings(String input){

            return getAllSubStrings(input).length;
    }
}
