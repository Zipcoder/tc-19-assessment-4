package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(char u : word.toCharArray()){
            if(isVowel(u))
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1)
                return word.indexOf(c);
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {

        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        if(character == 'a'|| character == 'e'|| character == 'i' ||character == 'o' ||character == 'u'||character == 'A'||character == 'E'||character == 'I'||character == 'U'||character == 'O')
        return true;
        return false;
    }
}
