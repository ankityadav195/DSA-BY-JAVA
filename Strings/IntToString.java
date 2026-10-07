package Strings;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String s = " ";
        // s= s+n;
        String s  = Integer.toString(n);
        System.out.print(s);
        sc.close();
    }
    
}
