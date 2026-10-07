package Revision;

import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
    int n = sc.nextInt();

    int nfact= 1;
    for(int i = 1 ; i<=n;i++){
        nfact = nfact*i;
        System.out.print(nfact );


    }
    sc.close();
    }
    
}
