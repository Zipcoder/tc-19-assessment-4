package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String result = "aeiou";
        for (int i = 0; i < word.length() ; i++) {
            if (hasVowels(word.toString())) ;
        }
        return true;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        char [] firstVowel = {'a','e','o','i','u','y'};

        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) == firstVowel[5]);
            return i;

        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return null;
    }

    public static Boolean isVowel(Character character) {
        return null;
    }
}
