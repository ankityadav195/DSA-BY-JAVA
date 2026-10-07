package Revision;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r =0;
        while(n!=0){
            r =r*10;
            r = r+(n%10);
            n =n/10;

        }
         sc.close();
        System.out.print(r);
    }
    
}
