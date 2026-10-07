package ArrayRevision;

import java.util.Scanner;

public class _05Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of Size array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // intput
        System.out.println("Enter a number of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // output
        int f = 0;
        int l = arr.length - 1;
        while ((f < l)) {
            int temp = arr[l];
            arr[l] = arr[f];
            arr[f] = temp;
            f++;
            l--;
        }

        for (int ele : arr)
            System.out.print(ele + " ");

    }
}
