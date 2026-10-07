package array ; 

// public class RotateArray {
//     public static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int k = 2;
//         int n = arr.length;

//         k = k % n;

//         // Step 1: reverse first k elements
//         reverse(arr, 0, k - 1);

//         // Step 2: reverse remaining
//         reverse(arr, k, n - 1);

//         // Step 3: reverse whole array
//         reverse(arr, 0, n - 1);

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

