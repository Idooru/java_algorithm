package algorithms.search.binarysearch;

public class BinarySearchServer {
    public static int findNumberIndex(int[] numArray, int key) {
        int left = 0;
        int right = numArray.length - 1;
        int middle;

        while (left <= right) {

            middle = (left + right) / 2;

            if (numArray[middle] == key) {
                return middle;
            }

            if (numArray[middle] > key) {
                right = middle - 1;
            }

            if (numArray[middle] < key) {
                left = middle + 1;
            }

        }

        return -1;
    }
}
