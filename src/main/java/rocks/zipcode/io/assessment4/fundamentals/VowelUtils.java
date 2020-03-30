package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] arr = word.toCharArray();
        char[] vowels = {'a', 'A', 'e', 'E', 'i','I', 'o', 'O', 'u', 'U'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arr[i] == vowels[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] arr = word.toCharArray();
        Integer index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                index = i;
                break;
            } else
                index = -1;
        }
        return index;
    }


    public static Boolean startsWithVowel(String word) {
        if (isVowel(word.charAt(0))) {
            return true;
        } else
        return false;
    }

    public static Boolean isVowel(Character character) {
        char[] vowels = {'a', 'A', 'e', 'E', 'i','I', 'o', 'O', 'u', 'U'};
        for (int i = 0; i < vowels.length; i++) {
            if (character == vowels[i]) {
                return true;
            }
        }
        return false;
    }
}
