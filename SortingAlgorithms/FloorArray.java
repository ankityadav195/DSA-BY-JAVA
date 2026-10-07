package SortingAlgorithms;

public class FloorArray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 10, 10, 12, 13};
        int target = 5;

        int low = 0, high = arr.length - 1;
        int ans = -1;  // store floor

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } 
            else if (arr[mid] < target) {
                ans = arr[mid];   // possible floor
                low = mid + 1;    // right side jao
            } 
            else {
                high = mid - 1;   // left side jao
            }
        }

        System.out.println(ans);
    }
}