package rocks.zipcode.io.assessment4.fundamentals;



import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return word.toLowerCase().contains("a") || word.toLowerCase().contains("e") || word.toLowerCase().contains("i") || word.toLowerCase().contains("o") || word.toLowerCase().contains("u");
    }

    public static Integer getIndexOfFirstVowel(String word) {
        if (!hasVowels(word)){
            return -1;
        }
        int firstInd = word.length()+1;
        int currentInd = 0;
        char[] vowelArray = new char[]{'a','e','i','o','u'};
        for(char vowel : vowelArray){
            currentInd = word.toLowerCase().indexOf(vowel);
            if (currentInd <= firstInd && currentInd >=0){
                firstInd = currentInd;
            }
        }
        return firstInd;
    }


    public static Boolean startsWithVowel(String word) {
        return (word.toLowerCase().startsWith("a") || word.toLowerCase().startsWith("e") || word.toLowerCase().startsWith("i") || word.toLowerCase().startsWith("o") ||word.toLowerCase().startsWith("u"));
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(character.toString());
    }
}
