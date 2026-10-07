
// // print the rectrangle

// // import java.util.Scanner;

// // public class patten {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print(" Enter a number of row:");
// //         int row = sc.nextInt();

// //         System.out.print("Enter a number of column:");
// //         int col = sc.nextInt();

// //         for (int i = 1; i <= row; i++) {

// //             for (int j = 1; j <=col; j++) {

// //                 System.out.print("*  "); 
// //             }
// //             System.out.println(  );
// //         }
// //     }
// // }

// // print the star of squres 

// // import java.util.Scanner;

// // public class patten {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print(" Enter a number of row:");
// //         int row = sc.nextInt();

// //         for (int i = 1; i <= row; i++) {

// //             for (int j = 1; j <=row; j++) {

// //                 System.out.print("*  "); 
// //             }
// //             System.out.println(  );
// //         }
// //     }
// // }

// // print the given patthen 1234 

// //  import java.util.Scanner;

// // public class patten {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print(" Enter a number of row:");
// //         int row = sc.nextInt();

// //         for (int i = 1; i <= row; i++) {

// //             for (int j = 1; j <=row; j++) {

// //                 System.out.print(j + " " ); 
// //             }
// //             System.out.println(  );
// //         }
// //     }
// // }

// //  print the given pattern alphabeth a b c d 
// //  import java.util.Scanner;

// // public class patten {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);

// //         System.out.print(" Enter a number of row:");
// //         int row = sc.nextInt();

// //         for (int i = 1; i <= row; i++) {

// //             for (int j = 1; j <=row; j++) {

// //                 System.out.print((char)(j+96) + " " ); 
// //             }
// //             System.out.println(  );
// //         }
// //     }
// // }

// // print the given pattern 1111 2222 3333 4444 

// // import java.util.Scanner;
// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int row = sc.nextInt();
// //         for(int i = 1 ; i <= row ; i++){
// //             for(int j = 1 ; j <=row ; j++){
// //                 System.out.print(i+ " ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // print the given pattern AAAA BBBB CCCC DDDD

//  import java.util.Scanner;
//  public class patten{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.print(" Enter a number : ");
//         int row = sc.nextInt();
//        for( int i = 1;i <=row ; i++ ){
//              for(int j= 1 ; j <=i ; j++){
//                 System.out.print((char)(j+64)+ " ");
//            }
//             System.out.println();
//          }
//      }
// }

// // print the given pattern aaaa BBBB cccc DDDD 

// // import java.util.Scanner;
// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner sc= new Scanner(System.in);
// //         System.out.print(" Enter a number : ");
// //         int row = sc.nextInt();
// //         for( int i = 1;i <=row ; i++ ){
// //             for(int j= 1 ; j <=row ; j++){
// //                 if(i%2==0){
// //                 System.out.print((char)(i+64)+ " ");
// //                 }else 
// //                     System.out.print((char) (i+96)+ " ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // print the given pattern * ** *** **** *****

// import java.util.Scanner; 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         for(int i = 1; i <=n  ; i++){
//             for(int j = 1 ; j <= i ; j++){
//                 System.out.print("* "); // j = 1 2 3 4 ,, //i =111 222 333 444
//             }
//             System.out.println();
//         }
//     }

// // print the given pattern 1 AB 123 ABCD 12345 

// import java.util.Scanner;

// public class Pattens {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {

//             // Odd rows → print numbers
//             if (i % 2 != 0) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print(j);
//                 }
//             } 
//             // Even rows → print alphabets
//             else {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print((char)(j + 64));
//                 }
//             }

//             System.out.println();
//         }
//     }
// }

// // print the given pattern ***** **** *** ** *

// // import java.util.Scanner;
// // public class pattern{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number: ");
// //         int n = sc.nextInt();

// //         for(int i = 1 ; i <= n; i++ ){
// //             for(int j = 1; j<= n+1-i; j++){ // int j = n ; j >= i ; j--;
// //                 System.out.print("* ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // print the given pattern  abcd abc ab a

// // import java.util.Scanner;
// // public class pattern{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number: ");
// //         int n = sc.nextInt();

// //         for(int i = 1 ; i <= n; i++ ){
// //             for(int j = 1; j<= n+1-i; j++){ // int j = n ; j >= i ; j--;
// //                 System.out.print((char) (j+96)  + " ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // print the hollow Rectangle 

// // import java.nio.channels.Pipe.SourceChannel;
// // import java.util.Scanner;

// // public class pattern {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number of rows : ");
// //         int row = sc.nextInt();

// //         System.out.print("Enter a number of col: ");
// //         int col = sc.nextInt();

// //         for (int i = 1; i <= row; i++) {

// //             for (int j = 1; j <= col; j++) {

// //                 if (i == 1 || i == row || j == 1 || j == col)
// //                     System.out.print("* ");
// //                 else
// //                     System.out.print("  ");
// //             }
// //             System.out.println();
// //         }

// //     }
// // }

// // print the star plus pattern 
// // import java.util.Scanner;
// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number of odd number to print : ");
// //         int n= sc.nextInt();
// //         int mid = n/2+1; 

// //         for(int i = 1 ; i <=n ; i ++){

// //             for(int j = 1 ; j <=n ; j++){
// //                 if(i==mid || j==mid ){
// //                     System.out.print("* ");

// //                 }
// //                 else System.out.print(  "- ");
// //             }
// //             System.out.println();
// //     }
// // }
// // }

// // print the given patterns cross 

// // import java.util.Scanner;
// // public class pattern {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a odd number : ");
// //         int n = sc.nextInt();

// //         for(int i = 1; i <= n ;i++){

// //             for(int j = 1 ; j <=n; j++){
// //                if( i==j|| i+j == n+ 1){
// //                 System.out.print("* ");
// //                 } else 
// //                     System.out.print(" ");

// //             }
// //             System.out.println();
// //         }
// //     }

// // }

// // print the given patterns 1 23 456 789
// // import java.util.Scanner;
// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner sc= new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int n = sc.nextInt();
// //         int a = 1;

// //         for(int i = 1 ; i<=n; i++){

// //             for (int j = 1 ; j<=i ; j++){

// //                 System.out.print(a +" "); // a++  
// //                 a++ ;
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // print the givern pattern 1 01 101 0101
// // import java.util.Scanner;
// // public class patten {
// //     public static void main(String[] args) {
// //         Scanner sc= new Scanner(System.in);
// //          System.out.print("Enter a number : ");
// //          int n =sc.nextInt();

// //          for( int i =1 ; i <= n ;i++){

// //             for(int j = 1 ; j<=i ; j++){
// //                 if((i  + j)% 2 == 0 )System.out.print(1 + " ");
// //                 else System.out.print(0 + " " );

// //             }
// //             System.out.println();
// //          }
// //     }
// // }

// // print the given pattern 

// // import java.util.Scanner;

// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner sc= new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int  n = sc. nextInt();

// //         for(int i = 1 ; i<= n ; i++){
// //              for(int j = 1; j<= i ; j++){
// //                 System.out.print( " *");
// //              }
// //              System.out.println();
// //         }
// //     }
// // }

// // print the given pattens 1 13 135 1357 13579 
// // import java.util.Scanner;
// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int n = sc.nextInt();

// //         for(int i = 1 ; i <= n ; i++){
// //             int a = 1; 
// //              for( int j = 1 ; j <=i ; j++){
// //                 System.out.print( a + " ");
// //                 a = a+ 2; 
// //              }
// //              System.out.println();
// //         }
// //     }
// // }

// // print the given pattens 1 13 135 1357 13579 
// // import java.util.Scanner;
// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int n = sc.nextInt();

// //         for(int i = 1 ; i <= n ; i++){
// //              for( int j = 1 ; j <=i ; j++){
// //                 System.out.print( 2* j -1+ " ");
// //              }
// //              System.out.println();
// //         }
// //     }
// // }

// // print the given patterns reverse * ** *** **** *****

// // import java.util.Scanner;

// // public class patten {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int n = sc.nextInt();

// //         for (int i = 1; i <= n; i++) { // its a line print only

// //             for (int j = 1; j <= n - i; j++) {
// //                 System.out.print("  ");

// //             }
// //             for( int j = 1; j <=i ; j++){
// //             System.out.print(j +" "); // i = 1 22 333 4444 ,j = 1 12 123 1234
// //            }

// //             // System.out.println();

// //         }
// //     }
// // }
// // print the given patterns reverse * ** *** **** *****

// // import java.util.Scanner;

// // public class patten {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number : ");
// //         int n = sc.nextInt();

// //         for (int i = 1; i <= n; i++) { // its a line print only

// //             for (int j = 1; j <= n - i; j++) {
// //                 System.out.print("  ");

// //             }
// //             for( int j = 1; j <=i ; j++){
// //             System.out.print((char)(i +64)+" "); // i = 1 22 333 4444 ,j = 1 12 123 1234
// //            }

// //             System.out.println();

// //         }
// //     }
// // }

// // print the given patten rhombus 

// // import java.util.Scanner;
// // public class patten{
// //     public static void main(String[] args) {
// //         Scanner ac = new Scanner(System.in);
// //         System.out.println("Enter a number: ");
// //         int n = ac.nextInt();

// //         for(int i = 1; i <= n ; i++){

// //             for(int j = 1 ; j <= n-i; j++){

// //                 System.out.print("  ");
// //             }
// //             for(int j = 1 ; j <= n ; j++  ){
// //               System.out.print("* ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }

// // print the given pattens  **** *** ** * 
// // import java.util.Scanner;
// // public class patten {

// //     public static void main(String[] args) {
// //         Scanner ac = new Scanner(System.in);
// //          System.out.println("Enter a number: ");
// //          int n = ac.nextInt();

// //          for(int i = n;  i>=1 ;i--){

// //             for(int j = 1 ; j <= n - i ; j++){
// //                 System.out.print("  ");
// //             }
// //             for( int j = 1 ; j <=i ; j++){
// //                 System.out.print(" *");
// //             }
// //             System.out.println();
// //          }
// //     }
// // }

// // print the given patten pramind theord 1 
// // import java.util.Scanner;
// // public class patten {

// //     public static void main(String[] args) {
// //         Scanner ac = new Scanner(System.in);
// //          System.out.println("Enter a number: ");
// //          int n = ac.nextInt();

// //          for(int i = 1;  i<=n ;i++){

// //             for(int j = 1 ; j <= n-i ; j++){
// //                 System.out.print("  ");
// //             }
// //             for( int j = 1 ; j <=2*i-1 ; j++){
// //                 System.out.print(j+" " );
// //             }
// //             System.out.println();
// //          }
// //     }
// // }

// // print the given patten pramind theord 2 
// // import java.util.Scanner;
// // public class patten {

// //     public static void main(String[] args) {
// //         Scanner ac = new Scanner(System.in);
// //          System.out.println("Enter a number: ");
// //          int n = ac.nextInt();
// //          int nsp = n-1, nst= 1;

// //          for(int i = 1;  i<=n ;i++){

// //             for(int j = 1 ; j <=nsp  ; j++){
// //                 System.out.print("  ");
// //             }
// //             for( int j = 1 ; j <=nst ; j++){
// //                 System.out.print(j+" " );
// //             }
// //             nsp--;
// //             nst += 2;
// //             System.out.println();
// //          }
// //     }
// // }

// // print the given patten Diamond 
// // import java.util.Scanner;

// // public class patten {

// //     public static void main(String[] args) {
// //         Scanner ac = new Scanner(System.in);
// //         System.out.print("Enetr a number: ");
// //         int n = ac.nextInt();
// //         int nsp = n - 1, nst = 1;

// //         for (int i = 1; i <= n; i++) {

// //             for (int j = 1; j <= nsp; j++) { // space
// //                 System.out.print("  ");
// //             }
// //             for (int j = 1; j <= nst; j++) { // print5

// //                 System.out.print("* ");

// //             }
// //             nsp--;
// //             nst += 2;
// //             System.out.println();
// //         }
// //    nsp =  1;
// //    nst = 2*n-3;

// //         for (int i = 1; i <= n-1; i++) {

// //             for (int j = 1; j <= nsp; j++) { // space
// //                 System.out.print("  ");
// //             }
// //             for (int j = 1; j <= nst; j++) { // print5

// //                 System.out.print("* ");

// //             }
// //             nsp++;
// //             nst -= 2;
// //             System.out.println();
// //         }
        


// //     }

// // print the given patten Bright

// // import java.util.Scanner;
// // public class patten {

// //     public static void main(String[] args) {
// //         Scanner ac = new Scanner(System.in);
// //         System.out.println("Enter a number: ");
// //         int n = ac.nextInt();
// //         for(int i = 1 ; i <=n ;i++){
// //             System.out.print("* ");
// //         }
// //         System.out.println();
// //         int nsp = 1 ;
                 
// //         for(int i = 1; i<= n-1; i++){

// //             for(int j = 1 ; j <= n-i ;j++){
// //                 System.out.print( "* " +"  ");


// //             }
// //             for(int j = 1 ; j <= nsp; j++){
// //                 System.out.print(" "+" ");
// //             }

// //              for(int j = 1 ; j <= n-i ;j++){
// //                 System.out.print( "*" +"  ");


// //             }
       
// //             nsp+=2 ; 
// //             System.out.println();
            


// //         }
// //     }
// // }
// // //         nsp = 1 ;
// // //          nst = 2*n -3 ;
        
// // //         for(int i = 1; i<= n-1; i++){

// // //             for(int j = 1 ; j <= nsp ;j++){
// // //                 System.out.print("  ");


// // //             }
// // //             for(int j = 1 ; j <= nst; j++){
// // //                 System.out.print("* ");
// // //             }
// // //             nsp++;
// // //             nst-=2 ; 
// // //             System.out.println();
            


// // //         }
// // //     }
// // // }

// import java .util .Scanner; 
// public class patten {

//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//          int n = ac .nextInt();
//                   for( int i = 1 ; i <=n ; i++){
//             for(int j = 1 ; j<= n; j ++ ){       
//                           if(i<j) System.out.print(i +" ");

//                 else System.out.print(j +" ");
//             }


//             System.out.println();
//         }
    
//         }
// }


// print the given pattern

// import java.util.Scanner;
// public class patten {

//     public static void main(String[] args) {
//         Scanner ac = new Scanner(System.in);
//         System.out.println("Enter a number : ");
//         int n = ac.nextInt();

//         for(int i =1 ; i <=2*n-1; i++){
//             for(int j = 1; j <= 2*n-1;j++){
//                 int a = i, b = j;
//                 if(i>n) a =2*n-i;
//                 if(j>n) b =2*n-j;
//                 System.out.print(Math.min(a,b)+" ");
                
//             }
//             System.out.println();
//             ac.close();
 
// }
// }