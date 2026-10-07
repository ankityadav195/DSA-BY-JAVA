package SortingAlgorithms;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MIN_VALUE;
            int minIndex = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] > min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // swap
             int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}