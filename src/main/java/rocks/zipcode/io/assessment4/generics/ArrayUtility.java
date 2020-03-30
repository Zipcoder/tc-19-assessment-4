package rocks.zipcode.io.assessment4.generics;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    private interface Checker {
        Boolean get(Long highest, Long curr);
    }

    public SomeType findOddOccurringValue() {
        Map<SomeType, Long> occurrences = Stream.of(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return getValue(occurrences.entrySet(), (l, c) -> c > l && c%2!=0);
    }

    public SomeType findEvenOccurringValue() {
        Map<SomeType, Long> occurrences = Stream.of(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return getValue(occurrences.entrySet(), (l, c) -> c > l && c%2==0);
    }

    public SomeType getValue(Set<Map.Entry<SomeType, Long>> freqMap, Checker check) {
        long highestOddOcc = 0;
        SomeType output = null;
        for (Map.Entry<SomeType, Long> entry : freqMap) {
            if (check.get(highestOddOcc, entry.getValue())) {
                highestOddOcc = entry.getValue();
                output = entry.getKey();
            }
        }
        return output;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Map<SomeType, Integer> occurrences = new HashMap<>();
        for (SomeType t : array) {
            occurrences.compute(t, (k,v) -> (v==null) ? 1 : v+1);
        }
        return occurrences.get(valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> newArr = Arrays.stream(this.array).filter(predicate::apply).collect(Collectors.toList());
        SomeType[] toR;
        if (newArr.size() > 0) {
            toR = (SomeType[]) java.lang.reflect.Array.newInstance(newArr.get(0).getClass(), newArr.size());
            int i = 0;
            for (SomeType t : newArr) {
                toR[i] = t;
                i++;
            }
        } else {
            toR = (SomeType[]) java.lang.reflect.Array.newInstance(Integer.class, newArr.size());
        }
        return toR;
    }
}
