package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static String vowels = "aeiou";

    public static Boolean hasVowels(String word) {
        char[] lower = word.toLowerCase().toCharArray();
        char[] newArr = vowels.toCharArray();
        Boolean check = false;

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < lower.length; j++) {
                if (lower[j] == newArr[i]) {
                    check = true;
                    break;
                }
            }
            if(check){
                break;
            }
        }
        return check;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] lower = word.toLowerCase().toCharArray();
        for (int i = 0; i < lower.length; i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (lower[i] == vowels.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        String lower = word.toLowerCase();
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == lower.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        Character lower = Character.toLowerCase(character);
        Boolean check = false;
        for (int i = 0; i < vowels.length(); i++) {
            if(lower == vowels.charAt(i)) {
                check = true;
            }
        }
        return check;
    }
}
