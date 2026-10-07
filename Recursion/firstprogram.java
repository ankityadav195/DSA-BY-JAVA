package Recursion;

import java.util.Scanner;

public class firstprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ankit(1,n);
        sc.close();

    }

    public static void ankit(int x,int n) {
        if (n<=x)
            return;
        System.out.println(x);
        ankit(x + 1,n);

    }

}
