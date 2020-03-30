package rocks.zipcode.io.assessment4.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType value : array){
            if (getNumberOfOccurrences(value) %2 != 0){
                return value;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType value : array){
            if (getNumberOfOccurrences(value) %2 == 0){
                return value;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int occurrences = 0;
        for (SomeType value : array){
            if (value == valueToEvaluate){
                occurrences++;
            }
        }
        return occurrences;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        int size = Arrays.stream(array).filter(predicate::apply).toArray().length;
        SomeType[] ans = (SomeType[]) Array.newInstance(array[0].getClass(), size);
        List<SomeType> list = Arrays.stream(array).filter(predicate::apply).collect(Collectors.toList());
        int counter = 0;
        for (SomeType st : list){
                ans[counter] = st;
            counter++;
        }
        return ans;
    }
}
