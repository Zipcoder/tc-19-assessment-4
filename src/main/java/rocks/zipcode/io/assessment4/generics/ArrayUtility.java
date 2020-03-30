package rocks.zipcode.io.assessment4.generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        int sum = 0;
        for (SomeType t :array) {
            if(getNumberOfOccurrences(t)%2==1)
                return t;
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        int sum = 0;
        for (SomeType t :array) {
            if(getNumberOfOccurrences(t)%2==0)
                return t;
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int c = 0;
        for (SomeType t :array) {
            if(t.equals(valueToEvaluate))
                c++;
        }
        return c;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = Stream.of(array).filter(predicate::apply).collect(Collectors.toList());
        SomeType[] newCopy = Arrays.copyOf(array,list.size());
        return list.toArray(newCopy);
    }
}
