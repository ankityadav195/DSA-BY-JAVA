package Array2d;

public class SankePrint {
    public static void main(String[] args) {
        int arr[][] = { { 4, 0, 5, 4 }, { 1, 4, 0, 9 }, { 4, 6, 2, 4 } ,{6,6,4,6}};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }

            }
            System.out.println();
        }

    }

}
