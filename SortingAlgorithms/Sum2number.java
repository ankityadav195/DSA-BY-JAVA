  package SortingAlgorithms;

import java.util.Arrays;

public class Sum2number {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 7, 38, 37, 4};
        int target = 10;

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair: " + arr[i] + " + " + arr[j]);
                i++;
                j--;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}