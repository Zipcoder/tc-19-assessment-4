package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0, indexToCapitalize) + str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase() + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.charAt(indexOfString) == characterToCheckFor.charValue()) {
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String temp;
        ArrayList<String> subs = new ArrayList<>();
        int k = 0;
        int count = -1;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                count++;
                String[] ans = new String[count + 1];
                ans[k++] += string.substring(i, j);
//                System.out.println(string.substring(i, j));
                subs.add(string.substring(i, j));
                System.out.println(subs);
                Object[] nextArr = subs.toArray();
                System.out.println(nextArr);
                String[] strArr = Arrays.copyOf(nextArr, subs.size(), String[].class);
                return strArr;
            }
        }
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        String temp;
        int count = -1;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                count++;
            }
        }
        return count;
    }

}
