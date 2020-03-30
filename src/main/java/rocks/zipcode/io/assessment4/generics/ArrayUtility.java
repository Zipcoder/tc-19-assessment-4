package rocks.zipcode.io.assessment4.generics;
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
        //return Stream.of(array).filter( e -> getNumberOfOccurrences(e)%2==1 ).findFirst().orElse(null);
        return filter( e -> getNumberOfOccurrences(e)%2==1 )[0];
    }

    public SomeType findEvenOccurringValue() {
        //return Stream.of(array).filter( e -> getNumberOfOccurrences(e)%2==0 ).findFirst().orElse(null);
        return filter( e -> getNumberOfOccurrences(e)%2==0 )[0];
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        //return (int)Stream.of(array).filter( e -> e.equals(valueToEvaluate)).count();
        return filter(e -> e.equals(valueToEvaluate)).length;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = Stream.of(array).filter(predicate::apply).collect(Collectors.toList());
        SomeType[] newCopy = Arrays.copyOf(array,list.size());
        return list.toArray(newCopy);
    }
}
