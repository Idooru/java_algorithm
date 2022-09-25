package algorithms.search.binarysearch;

import utils.ArrayMaker;
import utils.Inputter;
import utils.Result;

public class BinarySearchClient {
    public static void main(String[] args) {
        findNumberFromSelfInputArray();
    }

    public static void findNumberFromSelfInputArray() {
        int valueToLength = Inputter.inputToLength();
        int[] numArray = ArrayMaker.getSequentialArrayWithInput(valueToLength);

        int valueToFind = Inputter.inputToFind();
        int result = BinarySearchServer.findNumberIndex(numArray, valueToFind);

        Result.check(result);
    }

    public static void findNumberFromRandomArray() {
    }
}
