package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        if(word.contains("a")|| word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")){
            return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String vowels = "aeiou";
        for (int index = 0; index < word.length(); index++)
        {
            if (vowels.contains(String.valueOf(word.charAt(index))))
            {
                return index;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        Character first = word.charAt(0);
        if(VowelUtils.isVowel(first)) {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        char result = Character.toLowerCase(character);
        return result == 'a' || result == 'e' || result == 'i' || result == 'o' || result == 'u';
    }

}
