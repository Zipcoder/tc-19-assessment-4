package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;

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

        String temp = "";
        int k = 0;
//        for (int i = 0; i < string.length() - 1; i++) {
//            for (int j = i + 1; j < string.length() - 2; j++) {
//                temp = string.substring(i, i + j);
//                listingSubs[k++] = temp;
//            }
//
//        }
//        return listingSubs;
        ArrayList<String> answer = new ArrayList<>();
        String[] listingSubs = new String[answer.size()];
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j <= string.length(); j++) {
                temp = string.substring(i, j);
                System.out.println(temp);
                answer.add(temp);
                System.out.println(answer);
                return null;
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
