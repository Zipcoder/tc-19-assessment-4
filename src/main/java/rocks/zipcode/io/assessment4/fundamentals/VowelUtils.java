package rocks.zipcode.io.assessment4.fundamentals;
import java.util.regex.*;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                return i;
            }
        }return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if (word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U'){
        return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if (character.equals('a') ||character.equals('e') || character.equals('i')|| character.equals('o')|| character.equals('u') || character.equals('A') || character.equals('E') || character.equals('I') || character.equals('O') ||
                character.equals('U')){
            return true;
        }
        return false;
        }



}
