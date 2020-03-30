package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        StringBuilder str = new StringBuilder(word);
        for(String each : vowels) {
            if(str.indexOf(each) > 0)
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer index = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] words = word.split("");

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (words[i].equalsIgnoreCase(String.valueOf(vowels))) {
                    index = i;
                }
            }
            return 5;

        }
        return 5;
    }

    public static Boolean startsWithVowel(String word) {
        if(VowelUtils.startsWithVowel(word) == true) {
            return true;
        }
        return true;
    }

    public static Boolean isVowel(Character character) {
        return null;
    }
}
