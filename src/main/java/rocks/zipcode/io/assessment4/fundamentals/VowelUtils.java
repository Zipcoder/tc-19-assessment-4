package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return getIndexOfFirstVowel(word) != -1;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isVowel(c))
                return word.indexOf(c);
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return "eaiouEAIOU".indexOf(word.charAt(0)) >=0;
    }

    public static Boolean isVowel(Character character) {
        return "AEIOUaeiou".indexOf(character) != -1;
    }
}
