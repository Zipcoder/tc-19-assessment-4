package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String toReturn = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != indexToCapitalize) {
                toReturn += str.substring(i, i+1);
            } else
            toReturn += str.substring(i, i+1).toUpperCase();
        }
        return toReturn;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char[] arr = baseString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == indexOfString && arr[i] == characterToCheckFor) {
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> arrList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                arrList.add(string.substring(i,j));
                count++;
                System.out.println(string.substring(i,j));
            }
        }

        String[] arr = new String[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            arr[i] = arrList.get(i);
        }

        return arr;
    }

    public static Integer getNumberOfSubStrings(String input){
        return input.length() * ((input.length() + 1) / 2 ) - 1;
    }
}
