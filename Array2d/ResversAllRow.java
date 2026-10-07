package Array2d;

import java.util.Scanner;

public class ResversAllRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row size : ");
        int n = sc.nextInt();

        System.out.print("Enter a col size : ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.print("Enter a elements : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = arr.length -1 ; i>=0; i--) {
            for (int j= arr[i].length-1;j>=0;j--) {
                System.out.print(arr[i][j] + " ");
                

            }
            sc.close();
            System.out.println();

        }
       
        }
    }

