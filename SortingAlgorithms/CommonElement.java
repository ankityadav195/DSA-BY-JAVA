package SortingAlgorithms;

public class CommonElement {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 7, 0 };
        int n = arr.length;

        int[] krr = { 4, 2, 5, 6, 8, };
        int m = krr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i] == krr[j]) {
                    System.out.print(arr[i] + " ");
                    break;

                }

            }

        }

    }
}
