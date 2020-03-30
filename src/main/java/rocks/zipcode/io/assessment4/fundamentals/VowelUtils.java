package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Boolean vowels = false;
        for (int i = 0; i < word.length (); i++) {
            if (word.charAt ( i ) == 'a' || word.charAt ( i ) == 'e' || word.charAt ( i ) == 'i' || word.charAt ( i ) == 'o' || word.charAt ( i ) == 'u') {
                vowels = true;
            }
        }
        return vowels;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer vowelAt = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vowelAt = i;
                break;
            }
        } return vowelAt;
    }


    public static Boolean startsWithVowel(String word) {
        Boolean startWith = false;
        if (word.toUpperCase ().charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U') {
            startWith = true;
        }
        return startWith;
    }
//        if (word.matches ( "\b[aeiouAEIOU]" )) {
//            startWith = true;
//        } return startWith;


    public static Boolean isVowel(Character character) {
        Boolean isAVowel = false;
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
        } isAVowel = true;

        return isAVowel;
    }
}
