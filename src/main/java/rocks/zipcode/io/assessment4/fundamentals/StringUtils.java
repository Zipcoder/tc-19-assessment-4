package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String[] newString = str.split("");
        String returnString = "";
        for(int i = 0; i < newString.length; i++){
            if(i == indexToCapitalize){
                returnString += newString[i].toUpperCase();
            }
            else{
                returnString += newString[i];
            }
        }
        return returnString;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        String[] newArray = baseString.split("");

        return newArray[indexOfString].equals(characterToCheckFor.toString());
    }

    public static String[] getAllSubStrings(String string) {
        List<String> newArray = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i + 1; j <= string.length(); j++){
                if(newArray.contains(string.substring(i,j))){
                    continue;
                }
                else {
                    newArray.add(string.substring(i, j));
                }
            }
        }
        String[] stringArray = newArray.toArray(new String[0]);
        return stringArray;
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] newArray = getAllSubStrings(input);
        return newArray.length;
    }
}
