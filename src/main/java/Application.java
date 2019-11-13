import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        int[] arr = new int[50];

        for (int i = 0;i < 50; i++){
            arr[i] = i;
        }

        int[] arr2 = {5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(SelectionSort.selectionSort(arr2))); // [2, 3, 5, 6, 10]


        System.out.println(BinarySort.binarySort(arr,13));

        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        QuickSort.quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }


}
