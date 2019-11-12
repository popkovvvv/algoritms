import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] arr = new int[50];

        for (int i = 0;i < 50; i++){
            arr[i] = i;
        }

        int[] arr2 = {5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(SelectionSort.selectionSort(arr2))); // [2, 3, 5, 6, 10]


        System.out.println(BinarySort.binarySort(arr,13));
    }

}
