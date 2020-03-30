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
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i] == array[j]){
                    count++;
                }

            }if (count % 2 == 1){
                return array[i];
            }
            else count = 0;
        }


        return null;
    }

    public SomeType findEvenOccurringValue() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length ; j++) {
                if (array[i] == array[j]){
                    count++;
                }

            }if (count % 2 == 0){
                return array[i];
            }
            else count = 0;
        }return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == valueToEvaluate){
                count++;
            }
        }return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return null ;
    }
}
