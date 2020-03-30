package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] c = str.toCharArray();
        c[indexToCapitalize] = Character.toUpperCase(c[indexToCapitalize]);
        return new String(c);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        String lbaseString = baseString.toLowerCase();
        if(lbaseString.indexOf(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
