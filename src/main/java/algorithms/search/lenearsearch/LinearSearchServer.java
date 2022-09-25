package algorithms.search.lenearsearch;

public class LinearSearchServer {
    public static int findNumberIndex(int[] numArray, int valueToFind) {
        int i = 0;

        while (i < numArray.length) {

            if (numArray[i] == valueToFind) {
                return i;
            }

            i++;
        }

        return -1;
    }
}
