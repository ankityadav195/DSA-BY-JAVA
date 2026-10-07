package array;

import java.util.Scanner;

public class _01ArrayRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to array length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //input

        System.out.print("Enter a input of arr : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //coffee
        int pro = 1;

        for (int i = 0; i < arr.length; i++) {
            pro = pro* arr[i];
        }
        System.out.println("Total sum is : "+pro );
        sc.close();
    }

}
