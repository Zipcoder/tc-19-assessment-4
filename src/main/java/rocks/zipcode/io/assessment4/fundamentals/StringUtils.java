package rocks.zipcode.io.assessment4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder retString = new StringBuilder();
        AtomicInteger i = new AtomicInteger(0);
        str.chars().mapToObj(x -> (char)x).
                forEachOrdered(x -> {
                    if(i.getAndIncrement() == indexToCapitalize){
                        retString.append(x.toString().toUpperCase());
                    }
                    else
                        retString.append(x);
                });
        return retString.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> sub = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String sString = string.substring(i, j);
                if (!sub.contains(sString))
                    sub.add(sString);
            }
        }
        return sub.stream().toArray(String[]::new);
    }

    public static Integer getNumberOfSubStrings(String input){
        return (int)Arrays.stream(getAllSubStrings(input))
                .count();
    }

}
