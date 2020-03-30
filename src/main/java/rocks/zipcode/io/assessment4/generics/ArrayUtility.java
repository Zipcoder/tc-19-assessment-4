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
        for(SomeType each : array) {
            if (!(getNumberOfOccurrences(each) % 2 == 0)) {
                return each;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType each : array) {
            if(getNumberOfOccurrences(each) % 2 == 0){
                return each;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int counter = 0;
        for(SomeType each : array) {
            if(each.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
