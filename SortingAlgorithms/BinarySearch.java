package SortingAlgorithms;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {23, 3455, 34, 6346, 375, 46, 346};
        int target = 46;

        // Step 1: sort the array
        Arrays.sort(arr);

        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            } 
            else if (arr[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element not found");
        }
    }
}