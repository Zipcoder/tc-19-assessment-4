package rocks.zipcode.io.assessment4.fundamentals;
/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return word.matches("(.*)[AEIOUaeiou](.*)");
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if(isVowel(word.toCharArray()[i]))
                return i;
        }
        return -1;
    }

    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return character.toString().matches("(?i)[aeiou]");
    }
}
