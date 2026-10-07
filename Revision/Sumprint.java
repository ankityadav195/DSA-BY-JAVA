package Revision;

import java.util.Scanner;

public class Sumprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a elements: ");
        int n = sc.nextInt();
        int sum= 0;
        while (n!=0) {
            sum = sum+(n%10);
            n = n/10;
            
            
        }
        sc.close();
        System.out.print("Sum of element is : " + sum);
    }
    
}
