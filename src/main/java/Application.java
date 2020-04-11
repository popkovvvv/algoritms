import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) throws IOException {
//        int[] arr = new int[50];
//
//        for (int i = 0;i < 50; i++){
//            arr[i] = i;
//        }
//
//        int[] arr2 = {5, 3, 6, 2, 10};
//        System.out.println(Arrays.toString(SelectionSort.selectionSort(arr2))); // [2, 3, 5, 6, 10]
//
//
//        System.out.println(BinarySort.binarySort(arr,13));
//
//        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
//        System.out.println("Было");
//        System.out.println(Arrays.toString(x));
//
//        int low = 0;
//        int high = x.length - 1;
//
//        QuickSort.quickSort(x, low, high);
//        System.out.println("Стало");
//        System.out.println(Arrays.toString(x));
        //ALTerNAtiNG.toAlternativeString("ltERnaTIng cAsE");
//        ExpressionsMatter.expressionsMatter(1, 2, 3);
//        Set<String> strings = new TreeSet<>();
//
//        List<Integer> bytes = new LinkedList<>();
//        int xuy = 12;
//        bytes.add(xuy);

//        OrdArray array = new OrdArray(10);
//        array.add(43);
//        array.add(435435);
//        array.add(22);
//
//        array.display();


        //System.out.println(Arrays.toString(bubbleSort(new int[]{3, 6, 2131, 64, 123, 58568})));

//        StackX theStack = new StackX(10);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);
//
//        while(!theStack.isEmpty() ) {
//            long value = theStack.pop();
//            System.out.print(value);
//            System.out.print(" ");
//        }
//
//        Deque<Integer> queue = new LinkedList();
//        queue.add(20);
//        queue.add(40);
//
//        while (!queue.isEmpty()) {
//            long val = queue.pop();
//            System.err.println(" ");
//            System.err.println(val);
//        }

        String input;
        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString();
            if (input.equals(" "))
                break;

            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int[] selectionSort(int[] arr)
    {
        int out, in, min;
        for (out = 0; out < arr.length - 1; out++) {
            System.out.println("out: " + out);
            min = out;
            for (in = out + 1; in < arr.length; in++) {
                System.out.println("in: " + in);
                if (arr[in] < arr[min]) {
                    min = in;
                    System.out.println("value: " + arr[min]);
                }
            }
            swap(arr, out, min);
        }

        return arr;
    }

    public static int[] bubbleSort(int[] arr)
    {
        int out, in;
        for (out = arr.length - 1; out > 1; out--) {
            System.out.println("out: " + out);
            for (in = 0; in < out; in++) {
                System.out.println("in: " + in);
                if (arr[in] > arr[in+1]) {
                    System.out.println("arr[in] " + arr[in]);

                    swap(arr, in, in + 1);
                }
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}
