package rocks.zipcode.io.assessment4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] newArr = str.toCharArray();
        newArr[indexToCapitalize] = Character.toUpperCase((newArr[indexToCapitalize]));
        return new String(newArr);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i++) {
            if(baseString.toCharArray()[indexOfString] == characterToCheckFor) {
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> subStr = new HashSet<>();

        for (int i = 0; i <= string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                subStr.add(string.substring(i,j));
            }
        }

        return subStr.toArray(new String[subStr.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
