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
        Map<SomeType, Long> map = Arrays.stream ( array ).collect ( Collectors.groupingBy ( x -> x, Collectors.counting () ) );
        long occurrenceCount = 0;
        SomeType value = null;
        for (Map.Entry<SomeType, Long> each : map.entrySet ()) {
            if (each.getValue () % 2 != 0) {
                occurrenceCount = each.getValue ();
                value = each.getKey ();
            }
        }
        return value;
    }

    public SomeType findEvenOccurringValue() {
        Map<SomeType, Long> map = Arrays.stream ( array ).collect ( Collectors.groupingBy ( x -> x, Collectors.counting () ) );
        long occurrenceCount = 0;
        SomeType value = null;
        for (Map.Entry<SomeType, Long> each : map.entrySet ()) {
            if (each.getValue () % 2 == 0) {
                occurrenceCount = each.getValue ();
                value = each.getKey ();
            }
        }
        return value;
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

        return Arrays.stream(array).filter(predicate::apply).collect(toList()).toArray(Arrays.copyOf(array, 0));
    }
}
