package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        return str.substring(0, indexToCapitalize) + str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase() + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> subStrings = new ArrayList<> ();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++){
                if (!subStrings.contains(string.substring(i, j)))
                    subStrings.add(string.substring(i, j));
            }
        }
        return subStrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        List<String> subStrings = new ArrayList<>();
        Integer counter = -1;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                if (!subStrings.contains(input.substring(i, j)))
                    subStrings.add(input.substring(i, j));
                counter++;
            }
        }return counter;
    }
}
