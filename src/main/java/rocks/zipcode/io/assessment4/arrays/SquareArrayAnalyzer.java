package rocks.zipcode.io.assessment4.arrays;
import rocks.zipcode.io.assessment4.generics.ArrayUtility;
import java.util.stream.Stream;

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

        ArrayUtility<Integer> squaredAU = new ArrayUtility<>(squaredValues);
        ArrayUtility<Integer> inputAU = new ArrayUtility<>(inputArray);
        return Stream.of(inputArray).allMatch( i -> squaredAU.getNumberOfOccurrences(i * i).equals(inputAU.getNumberOfOccurrences(i)));

    }
}
