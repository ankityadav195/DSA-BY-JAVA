// package Recursion;

// import java.util.Scanner;

// public class Userinput {
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = ac.nextInt();
//         place( 1,n);
//         ac.close();
//     }
//      public static void place( int x ,int n){
//         if(x>n ) return;

//         System.out.println(x);
//         place( x+1,n);
//      }

// }

// Print the number of 1 to n with useing GlobalVariables 

package Recursion;

import java.util.Scanner;

public class Userinput {
    static int n;

    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = ac.nextInt();
        place(n);
        ac.close();
    }

    public static void place(int n) {
        if (n == 0)
            return;

        place(n - 1);
        System.out.println(n);
    }

}
