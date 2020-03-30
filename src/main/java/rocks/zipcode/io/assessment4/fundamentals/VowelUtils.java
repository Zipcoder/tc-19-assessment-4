package rocks.zipcode.io.assessment4.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Pattern pattern = Pattern.compile("(?i)[aieou]");
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static Integer getIndexOfFirstVowel(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.charAt(i))){
                return i;
            }

        }
        return -1;
    }

    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return "AEIOUaeiou".indexOf(character) != -1;
    }
}
