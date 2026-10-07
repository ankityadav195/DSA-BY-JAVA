// import java.util.Scanner;

// public class star {
//     public static void main(String[] args) {
//         int i , n, k,j;// number of rows
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         n = sc.nextInt();

//         for (i = n; i >= 1; i--) {
//             // print spaces first
//             for (j = 0; j < n - i; j++) {
//                 System.out.print(" ");
//             }
//             // then print stars
//             for ( k = 1; k <= i; k++) {
//                 System.out.print(k+j); //k , i , j "*"
//             }
//             // move to next line
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;

// class pyramind 
// {
//   public static void main(String[] args) {
//     int i,n, j,k ;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number :");
//     n = sc.nextInt();

//     for( i = 1 ; i <= n; i++)
//          {
//             for (j = 1 ; j<=n-i; j++  )
//                 System.out.print(" "); {
//         }
//             for(k = 1 ; k < 2* i-1 ;k ++){
//                 System.out.println("*");
//             }
//             System.out.println();
//       }
//         }
//     }


// import java.util.Scanner;

// class Pyramid {
//     public static void main(String[] args) {
//         int i, n, j, k;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         n = sc.nextInt();

//         for (i = 1; i <= n; i++) {
//             // print spaces
//             for (j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // print stars
//             for (k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*"); // i , j ,"*"
//             }
//             // move to next line
//             System.out.println();
//         }
//     }
// }



//  import java.util.Scanner;

// class staring {
//     public static void main(String[] args) {
//         int i, j, k, n;
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         n = sc.nextInt();

//         for (i = n; i >= 1; i--) {

//             // spaces
//             for (j = i; j < n; j++) {
//                 System.out.print(" ");
//             }

//             // stars
//             for (k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }
