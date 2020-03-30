package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {

        char[] chars = str.toCharArray();

        chars[indexToCapitalize] = Character.toUpperCase(chars[indexToCapitalize]);
        String string = new String(chars);
        return string;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        if (baseString.charAt(indexOfString) == characterToCheckFor)
            return true;

        return false;
    }

    public static String[] getAllSubStrings(String string) {

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                if (!arrayList.contains(string.substring(i, j))) {
                    arrayList.add(string.substring(i,j));
                }
            }
        }
        return arrayList.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){

        int count = -1;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                count++;
            }
        }
        return count;
    }
}
