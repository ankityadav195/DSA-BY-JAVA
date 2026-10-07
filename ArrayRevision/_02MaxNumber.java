package ArrayRevision;

import java.util.Scanner;

public class _02MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // input
        System.out.print("Enter a arr number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // output
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        sc.close();
        System.out.println("maximum number is a : " + max);

    }

}
