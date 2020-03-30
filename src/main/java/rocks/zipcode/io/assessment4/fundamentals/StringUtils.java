package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize) +
                str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase()
                + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> listOfSubStrings = new ArrayList<>();

        for(int i = 0; i < string.length(); i++){
            for(int j =  i + 1; j <= string.length(); j++){
                if(!listOfSubStrings.contains(string.substring(i, j))) {
                    listOfSubStrings.add(string.substring(i, j));
                }
            }
        }
        return listOfSubStrings.stream().toArray(String[]::new);
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] arr = getAllSubStrings(input);
        return arr.length;
    }
}
