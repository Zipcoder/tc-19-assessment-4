package rocks.zipcode.io.assessment4.generics;

import java.lang.reflect.Array;
import java.util.function.Function;

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
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return array[i];
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count % 2 != 1) {
                return array[i];
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        Integer count = 0;

        // Creating a Generic Array
        @SuppressWarnings("unchecked")
        SomeType[] a = (SomeType[]) Array.newInstance(array[0].getClass(), array.length);
        for (int i = 0; i < array.length; i++) {
            if (predicate.apply(array[i])) {
                a[count++] = array[i];
            }
        }

        // Creating a Generic Array
        @SuppressWarnings("unchecked")
        SomeType[] b = (SomeType[]) Array.newInstance(array[0].getClass(), count);
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
