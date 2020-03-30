package rocks.zipcode.io.assessment4.generics;

import java.lang.reflect.Array;
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

        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                return array[i];
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count % 2 == 0){
                return array[i];
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        Integer count = 0;
        SomeType[] newArray = (SomeType[]) Array.newInstance(array[0].getClass(), array.length);
        for(int i = 0; i < array.length; i++){
            if(predicate.apply(array[i])) {
                newArray[count++] = array[i];
            }
        }
        SomeType[] newArray2 = (SomeType[]) Array.newInstance(array[0].getClass(), count);
        for(int i = 0; i < newArray2.length; i++){
            newArray2[i] = newArray[i];
        }
        return newArray2;
    }
}
