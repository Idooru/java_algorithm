package algorithms.search.lenearsearch;

import utils.ArrayMaker;
import utils.Inputter;
import utils.Result;

import java.util.Arrays;

public class LinearSearchClient {
    public static void main(String[] args) {
//        findNumberFromSequentialArray();
        findNumberFromRandomArray();
    }

    public static void findNumberFromSequentialArray() {
        int valueToLength = Inputter.inputToLength();
        int[] numArray = ArrayMaker.getSequentialArray(valueToLength);

        int valueToFind = Inputter.inputToFind();
        int result = LinearSearchServer.findNumberIndex(numArray, valueToFind);

        Result.check(result);
    }

    public static void findNumberFromRandomArray() {
        int valueToLength = Inputter.inputToLength();
        int valueToRange = Inputter.inputToRange();

        int[] numArray = ArrayMaker.getRandomArray(valueToLength, valueToRange);
        System.out.println(Arrays.toString(numArray));

        int valueToFind = Inputter.inputToFind();
        int result = LinearSearchServer.findNumberIndex(numArray, valueToFind);

        Result.check(result);
    }

}