package Recursion;

import java.util.Scanner;

public class AraisedPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base : ");
        int a = sc.nextInt();

        System.out.print("Enter a exponent: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println(a + "raise to the power " + b + " is " + pow(a, b));

    }

    public static int pow(int a, int b) {
        if (b == 0)
            return 1;
        int call = pow(a, b/2);
        // return a*pow(a,b-1);
        if (b % 2 == 0)
            return call*call;
        else
            return a*call*call;
    }
}
