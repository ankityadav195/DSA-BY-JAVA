package array;
// // sum of the array

import java.util.Scanner;

public class SumElement {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = ac.nextInt();
        int tt = 0;

        int[] ankit = new int[n];
        System.out.print("Enter a numbe of element : ");
        for (int i = 0; i < n; i++) {
            ankit[i] = ac.nextInt();
        }

        for (int i = 0; i < n; i++) {
            tt = tt + ankit[i];
        }
        System.out.print(tt + " ");

        ac.close();
    }

}

// product of the array 

// package array;

// import java.util.Scanner;

// public class SumElement {
//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = ac.nextInt();
//         int tt = 1;

//         int[] ankit = new int[n];
//         System.out.print("Enter a numbe of element : ");
//         for (int i = 0; i < n; i++) {
//             ankit[i] = ac.nextInt();
//         }

//         for (int i = 0; i < n; i++) {
//             tt = tt * ankit[i];
//         }
//         System.out.print(tt + " ");

//         ac.close();
//     }

// }

// maximum number 

// import java.util.Scanner;

// public class InnerSumElement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
        
        
//         int[] ankit = new int[n];
//         // int min = ankit[0];
//         int min=ankit[0];
//         System.out.println("Enter a number of elements: ");
//         for (int i = 0; i <n ; i++) {
//             ankit[i] =  sc.nextInt();
           
//         }
//         // int max  = Integer.MIN_VALUE;
        
//         for(int i = 0 ; i<ankit.length;  i++){
//             //  if(ankit[i]>max);
//             // max = ankit[i];
//              if(ankit[i]<min);
//             min = ankit[i];
//         }
        
       
//         System.out.print(min+ " ");
//       sc.close();
//     }
// }