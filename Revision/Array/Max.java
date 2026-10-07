package Revision.Array;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a row of elements: ");
        int row = sc.nextInt();
        System.out.print("enter a colm of elements: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int max = arr[0] [0];
        // input form user
        System.out.print("enter a elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i] [j] > max) {
                    max = arr[i] [j];
                }
                
            }
            
        }
        sc.close();
        System.out.print( max +" ");
    }
}