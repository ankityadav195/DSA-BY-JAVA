package Revision;

import java.util.Scanner;

public class AraiseB {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = ac.nextInt();

        System.out.print("Enter a number of squre : ");
        int m = ac.nextInt();
        int res = 1;

        for(int i = 1; i<=m;i++){
        res = res*n;
    }
     ac.close();
    System.out.print(res);
    }

}
