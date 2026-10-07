package java;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];
        System.out.println("Enter a n number : ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    arr[i][j][k] = sc.nextInt();

                }
            }
        }
        for (int i = 0; i <= 2; i++) {
            System.out.print("print of laye " + " ");
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        sc.close();
    }
}
