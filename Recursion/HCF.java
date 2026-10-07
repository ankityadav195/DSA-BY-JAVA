package Recursion;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a first number: ");
       int n = sc.nextInt();

        System.out.print("Enter a Scond number: ");
       int m = sc.nextInt();
       sc.close();
       int x = 1;

       for(int i = 1; i<=Math.min(n, m);i++){
        if(n%i==0  || m%i==0);
        x= i;
    }
    System.out.println(x);


    //public static int gcb (int a , int b){
    // if(a==0) return b
    //return gcb (b%a,a)
    // }


    // }
    }
    
}
