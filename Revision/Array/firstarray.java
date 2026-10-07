package Revision.Array;

import java.util.Scanner;

public class firstarray {
    public static void main(String[] args) {
        // int [] arr = {134,14,14,1234,2,1};
        // for(int i = 0;i<=4;i++){

        // System.out.print(arr[i]+" ");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row number : ");
        int row = sc.nextInt();

        System.out.print("Enter a colm number : ");
        int colm = sc.nextInt();

        int arr[][] = new int[row][colm];

        System.out.println("Enter a number of element: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i] [j] + " ");
            }
            System.out.println(  );
        }
        sc.close();

    }

}
