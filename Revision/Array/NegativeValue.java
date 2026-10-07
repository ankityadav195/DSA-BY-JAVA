package Revision.Array;

import java.util.Scanner;

public class NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input form user
          System.out.println("enter a elements: ");

        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        
        System.out.println("Result is: ");
        for(int i =0 ;i<n;i++){
            if(arr[i]<0)
            System.out.print(arr[i]+" ");
        }
        sc.close();
        }
    

}
