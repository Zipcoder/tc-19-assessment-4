package rocks.zipcode.io.assessment4.generics;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (int i = 0; i < array.length; i++) {
            if (getNumberOfOccurrences ( array[i] ) % 2 == 1)
                return array[i];
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (int i = 0; i < array.length; i++) {
            if (getNumberOfOccurrences ( array[i] ) % 2 == 0)
                return array[i];
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer occurrenceCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals ( valueToEvaluate )) {
                occurrenceCount++;
            }
        }
        return occurrenceCount;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return Arrays.stream ( array ).filter ( predicate::apply ).collect ( toList () ).toArray ( Arrays.copyOf ( array, 0 ) );
    }
}
