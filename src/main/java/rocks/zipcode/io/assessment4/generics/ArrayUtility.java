package rocks.zipcode.io.assessment4.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType t : array){
            if(getNumberOfOccurrences(t) %2 != 0){
                return t;
            }
        }

        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType t : array){
            if(getNumberOfOccurrences(t) %2 == 0){
                return t;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for (SomeType t : array) {
            if (valueToEvaluate.equals(t))
                count++;
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        Integer count = 0;

        @SuppressWarnings("unchecked")
        SomeType[] a = (SomeType[]) Array.newInstance(array[0].getClass(), array.length);

        for (int i = 0; i < array.length; i++) {
            if (predicate.apply(array[i])) {
                a[count++] = array[i];
            }
        }
        @SuppressWarnings("unchecked")

        SomeType[] b = (SomeType[]) Array.newInstance(array[0].getClass(), count);
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        return b;    }


}
