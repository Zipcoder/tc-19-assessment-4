package rocks.zipcode.io.assessment4.generics;



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
        return findOccurringValue(1);
    }


    public SomeType findEvenOccurringValue() {
        return findOccurringValue(0);
    }

    public SomeType findOccurringValue(int i) {
        for (SomeType st : array){
            if (( getNumberOfOccurrences(st) + i ) % 2 == 0) return st;
    }

  return null;

}
    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
            int count =0;
            for(SomeType currentItem : array)
            {
                if(currentItem == valueToEvaluate )
                    count++;
            }

            return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        SomeType[] result = array.clone();
        Integer index =0;
        for( SomeType st : array){
            if(predicate.apply(st)){
                result[index++] = st;

            }
        }
        return Arrays.copyOf(result, index) ;

    }
}
