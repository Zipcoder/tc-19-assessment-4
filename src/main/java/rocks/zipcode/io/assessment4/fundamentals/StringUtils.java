package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String upperCase = "";
        upperCase += Character.toUpperCase(str.charAt(indexToCapitalize));
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i == indexToCapitalize){
                result.append(upperCase);
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                String sub = string.substring(i,j);
                if(!resultList.contains(sub)){
                    resultList.add(sub);
                }
            }
        }
        return resultList.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] resultArray = getAllSubStrings(input);
        return resultArray.length;
    }
}
