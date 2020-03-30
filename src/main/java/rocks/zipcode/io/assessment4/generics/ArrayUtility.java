package rocks.zipcode.io.assessment4.generics;

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
        for (SomeType element : array) {
            if(getNumberOfOccurrences(element) % 2 != 0)
                return element;
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType element : array) {
            if(getNumberOfOccurrences(element) % 2 == 0)
                return element;
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for (SomeType element : array) {
            if(valueToEvaluate == element) {
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
