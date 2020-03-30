package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(indexToCapitalize, Character.toUpperCase(stringBuilder.charAt(indexToCapitalize)));
        String result = "" + stringBuilder;

        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
       char[] arr = new char[baseString.length()];
        for (int i = 0; i < baseString.length() ; i++) {
            arr[i] = baseString.charAt(i);
        }
        if (arr[indexOfString] == (characterToCheckFor)){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        String[] arr;
        String toBeSplit = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
               if (!string.substring(i,j).equals(" "))
                toBeSplit += (string.substring(i,j) +",");
                System.out.println(string.substring(i,j));}
            }

        arr = toBeSplit.split(",");


        return arr;
    }

    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        return n * (n + 1) / 2 - 1;
    }
}
