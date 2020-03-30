package rocks.zipcode.io.assessment4.fundamentals;

import java.util.HashSet;
import java.util.Set;

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
        //String lcharacterToCheckFor = characterToCheckFor.toLowerCase();
        if(lbaseString.indexOf(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                set.add(string.substring(i,j));
            }
        }
        return set.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        int answer = input.length();

        return answer * (answer + 1) / 2 -1;
    }
}
