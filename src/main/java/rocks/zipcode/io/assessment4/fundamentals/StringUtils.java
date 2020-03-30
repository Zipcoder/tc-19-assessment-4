package rocks.zipcode.io.assessment4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        //str.substring(indexToCapitalize, 1).toUpperCase() + str.substring(1);

        char[] arr = str.toCharArray();
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        String result = new String(arr);

        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

       // String text = baseString;
       // char characterToCheckFor = characterToCheckFor.charAt(0);

        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {

        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int k = 1; k <= string.length() - i; k++) {
                substrings.add(string.substring(i, i+k));
            }
        }
        String[] subString = new String[substrings.size()];
        int i = 0;
        for (String s : substrings) {
            subString[i] = s;
            i++;
        }
        return subString;

    }

    public static Integer getNumberOfSubStrings(String input){
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int k = 1; k <= input.length() - i; k++) {
                substrings.add(input.substring(i, i+k));
            }
        }
        return substrings.size();
    }
}
