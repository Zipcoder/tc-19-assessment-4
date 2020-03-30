package rocks.zipcode.io.assessment4.fundamentals;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        List<Character> characters = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        Character c = Character.toUpperCase(characters.get(indexToCapitalize));
        characters.set(indexToCapitalize, c);
        return characters.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString)==characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                list.add(string.substring(i,j));
            }
        }
        return list.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        List<String> list = Arrays.asList(getAllSubStrings(input));
        return list.size();
    }
}
