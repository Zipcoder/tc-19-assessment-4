package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.toCharArray()[i])){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.toCharArray()[i])) {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if (isVowel(word.charAt(0))){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' ||
                character == 'o' || character == 'O' || character == 'u' || character == 'U'){
            return true;
        }
        return false;
    }
}
