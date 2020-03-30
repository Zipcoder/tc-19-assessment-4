package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        StringBuilder str = new StringBuilder(word);
        for (String each : vowels) {
            if (str.indexOf(each) > 0)
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            if (hasVowels(word)) {
                if (vowels.contains(String.valueOf((word.charAt(i))))) {
                    return i;
                }
            }
        }
            return -1;

    }

    public static Boolean startsWithVowel(String word) {
        if (getIndexOfFirstVowel(word) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static Boolean isVowel(Character character) {
        char c = Character.toLowerCase(character);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            return true;
        }
        return false;
    }
}

