package Revision.pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a row element: ");
    int row= sc.nextInt();

    System.out.print("Enter a col element: ");
    int col= sc.nextInt();

    for(int i= 1; i<=row; i++){
        for(int j =1; j<=col ;j++){
            if(i==1 || i==row || j==1 || j==col)
                System.out.print("8 ");
            else
                System.out.print( "  ");
            
        }
        System.out.println();
        }
         sc.close();
    }

}
    

