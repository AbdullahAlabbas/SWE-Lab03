import java.util.Arrays;

public class Sorter {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 2, 8};
        System.out.println("Before the sort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After the sort: " + Arrays.toString(arr));
    }
}