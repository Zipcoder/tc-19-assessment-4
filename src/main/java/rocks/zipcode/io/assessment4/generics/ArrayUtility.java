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
        for (SomeType someType : array) {
            int count = 0;
            for (SomeType type : array) {
                if (someType == type)
                    count++;
            }
            if (count % 2 != 0) {
                return someType;
            }
        }

        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType someType : array) {
            int count = 0;
            for (SomeType type : array) {
                if (someType == type)
                    count++;
            }
            if (count % 2 == 0) {
                return someType;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int numberOfDuplicates=0;
        for (SomeType someType : array) {
            if (someType.equals(valueToEvaluate)) {
                numberOfDuplicates++;
            }
        }
        return numberOfDuplicates;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
