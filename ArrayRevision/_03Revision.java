package ArrayRevision;

import java.util.Scanner;

public class _03Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of arr : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter a number of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a number to find ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                break;

            }
        }
        if (found) {
            System.out.println("Found number is present : " + x);
        } else {
            System.out.println("Not found" + x);
        }

        sc.close();
    }
}
