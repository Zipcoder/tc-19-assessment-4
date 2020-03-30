package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        String wordUp = word.toUpperCase();
        char[] words = wordUp.toCharArray();

        for (int i = 0; i < words.length; i++) {
            char temp = words[i];

            if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {

                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        for (int i = 0; i < word.length(); i++) {

            char temp = word.charAt(i);

            if ("AEIOUaeiou".indexOf(temp) != -1)
                return word.indexOf(temp);
        }
        return -1;
    }

    public static Boolean startsWithVowel(String word) {

        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {

        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' ||
                character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {

            return true;
        }

        return false;
    }


}
