package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(indexToCapitalize, Character.toUpperCase(str.charAt(indexToCapitalize)));
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString)==characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        HashSet<String> subs = new HashSet<>();
        String[] powerSet = new String[0];
        for (int i = 0;i<=string.length();i++){
            for (int j = i+1; j <= string.length();j++){
                subs.add(string.substring(i,j));
            }
        }
        powerSet = new String[subs.size()];
        int counter = 0;
        for(String str : subs){
            powerSet[counter] = str;
            counter++;
        }
        return powerSet;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
