package Revision.pattern;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        System.out.print("Enter a row : ");
        int row = cs.nextInt();

        System.out.print("Enter a col:");
        int col = cs.nextInt();

        for(int i =1;i<=row;i++){
            for(int j = 1; j<=col;j++){
                System.out.print("* " +" ");
            }
            System.out.println();
        }
         cs.close();
    }
    
}
