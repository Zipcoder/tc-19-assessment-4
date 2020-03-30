package rocks.zipcode.io.assessment4.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
       char[] arr = word.toCharArray();
        for (char c : arr) {
            if(isVowel(c)){
               return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer result = -1;
        for (int i = 0; i < word.length(); i++) {
            String temp = "";
            temp += word.charAt(i);
            if(hasVowels(temp)){
                result = i;
                break;
            }
        }
        return result;
    }

    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        String temp = character.toString();
        Pattern pat = Pattern.compile("(?i)[aeiou]");
        Matcher mat = pat.matcher(temp);
        return mat.find();
    }
}
