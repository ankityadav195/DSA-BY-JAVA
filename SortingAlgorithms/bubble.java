package SortingAlgorithms;

public class bubble {
    public static void main(String[] args) {
        int[] arr = { 236, 37, 784, 56, 6, 327, 83, 91 };
        int n = arr.length;

         for (int i = 0; i <= n - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;

                }

            }
            if (swaps == 0)
                break;

        }

        for (int ele : arr)
            System.out.print(ele + " ");

    }
}

// SORT NUMBERS (ASCENDING OR DESCENDING) USING USER INPUT IN JAVA.

// public class bubble {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number of array size :");
// int n = sc.nextInt();
// int[] arr = new int[n];

// System.out.print("Enter elements : ");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();

// }
// System.out.println("Enter a number to choice 1 for ascending and 2 is
// decending : ");
// int choice = sc.nextInt();

// for (int i = 0; i < n - 1; i++) {
// for (int j = 0; j < n - 1 - i; j++) {

// if (choice == 1) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;

// }
// } else if (choice == 2) {
// if (arr[j] < arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;

// }

// }

// }
// }
// sc.close();
// for (int ele : arr)
// System.out.print(ele + " ");
// }
// }