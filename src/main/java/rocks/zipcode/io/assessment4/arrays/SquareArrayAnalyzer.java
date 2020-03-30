package rocks.zipcode.io.assessment4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        List<Integer> squareArray = new ArrayList<>();
        List<Integer> squared = new ArrayList<>();
        for (Integer a : inputArray) {
            squared.add(a * a);
        }
        Collections.addAll(squareArray, squaredValues);
        for (Integer a : squared) {
            if (!squareArray.contains(a)) {
                return false;
            }
        }
        return true;
    }
}
