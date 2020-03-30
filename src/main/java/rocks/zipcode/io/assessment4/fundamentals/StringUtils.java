package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] arr = str.toCharArray();
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        String result = new String(arr);
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){

        return null;
    }
}
