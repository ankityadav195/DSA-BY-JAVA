package Recursion;

// public class GlobalVariables {
//     static int x = 10;
//     public static void main(String[] args) {
//         fun();
//         System.out.println(x);
//     }
//     public static void fun(){
//         x = 40;
//     }

    
// }


// public class GlobalVariables {
//     static int x = 10;
//     public static void main(String[] args) {
//         fun();
//        x = 7;
//         System.out.println(x);
//         // x =8;
//         // System.out.println(x);
//         // x = 9;
//     }
//     public static void fun(){
//         x = 40;
//     }

    
// }

// Print the number of 1 to n with useing GlobalVariables 

// package Recursion;

import java.util.Scanner;

public class GlobalVariables {
    static int n;
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = ac.nextInt();
        place(1);
        ac.close();
    }

    public static void place(int x) {
        if (x > n)
            return;

        System.out.println(x+" ");
        place(x + 1);
    }

}
