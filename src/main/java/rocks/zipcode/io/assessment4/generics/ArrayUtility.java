package rocks.zipcode.io.assessment4.generics;

import java.util.ArrayList;
import java.util.Arrays;
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
        SomeType result = null;
        for (SomeType type : array) {
            if (!(getNumberOfOccurrences(type) % 2 ==0)) {
                result = type;
            }
        }
        return result;
    }

    public SomeType findEvenOccurringValue() {
        SomeType result = null;
        for (SomeType type : array) {
            if (getNumberOfOccurrences(type) % 2 ==0) {
                result = type;
            }
        }
        return result;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for (SomeType type : array) {
            if (type == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        ArrayList<SomeType> result = new ArrayList<>();
        for (SomeType type : array) {
            if (predicate.apply(type)) {
                result.add(type);
            }
        }
        SomeType[] resultArr = Arrays.copyOf(array, result.size());
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
}
