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
        LinkedList<String> arrayList = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int k = i + 1; k < string.length(); k++) {
                arrayList.add(i, string.substring(i, k));
                arrayList.add(i, string.substring(i, k + 1));
            }
        }
        List<String> removeDuplicates = new ArrayList<>(new HashSet<>(arrayList));
        String[] arr = new String[removeDuplicates.size() + 1];
        for (int i = 0; i < removeDuplicates.size(); i++) {
            arr[i] = removeDuplicates.get(i);
        }
        arr[arr.length - 1] = string.substring(string.length() - 1);
        return arr;
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] arr = getAllSubStrings(input);
        return arr.length;
    }
}
