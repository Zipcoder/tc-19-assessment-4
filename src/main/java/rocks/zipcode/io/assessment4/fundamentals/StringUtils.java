package rocks.zipcode.io.assessment4.fundamentals;

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
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
