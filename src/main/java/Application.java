public class Application {
    public static void main(String[] args) {
        int[] arr = new int[50];

        for (int i = 0;i < 50; i++){
            arr[i] = i;
        }

        System.out.println(BinarySort.binarySort(arr,13));
    }

}
