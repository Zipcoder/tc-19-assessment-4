package rocks.zipcode.io.assessment4.generics;

import java.util.ArrayList;
import java.util.List;
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

        SomeType oddValue = null;

        for(SomeType value : array) {
            if (getNumberOfOccurrences(value) % 2 == 1) {
                oddValue = value;
            }
        }
        return oddValue;
    }

    public SomeType findEvenOccurringValue() {

        SomeType evenValue = null;

        for(SomeType value : array) {
            if (getNumberOfOccurrences(value) % 2 == 0) {
                evenValue = value;
            }
        }
        return evenValue;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        int numberOfOccurrences = 0;

        for(SomeType value : array) {
            if (value.equals(valueToEvaluate)) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return null;
    }
}
