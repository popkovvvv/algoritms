public class BinarySearch {
    public static Object binarySearch(int[] arr, int wanted) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + high;

            if (arr[mid] == wanted)
            {
                return mid;
            }

            if (arr[mid] < wanted)
            {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return null;
    }
}
