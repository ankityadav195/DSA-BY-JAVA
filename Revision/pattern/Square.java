package Revision.pattern;

import java.util.Scanner;

public class Square {

    // public static void main(String[] args) {
    // Scanner cs= new Scanner(System.in);
    // System.out.print("Enter a element : ");
    // int n = cs.nextInt();

    // for(int i =1;i<=n;i++){
    // for(int j = 1; j<=n;j++){
    // System.out.print("* " +" ");
    // }
    // System.out.println();
    // }
    // }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter a element : ");
        int n = cs.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " ");
                System.out.print((char)(j+96));
            }
            System.out.println( );
        }
         cs.close();
    }

}
