package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (hasVowels(word)){
                if (vowels.contains(String.valueOf(word.charAt(i)))) return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        char ch = word.toLowerCase().charAt(0);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static Boolean isVowel(Character character) {
        if (Character.isUpperCase(character)) {
            char ch = Character.toLowerCase(character);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        } else if (Character.isLowerCase(character)) {
            return character == 'a' || character == 'e' || character == 'i' ||
                    character == 'o' || character == 'u';
        }
        return false;
    }
}
