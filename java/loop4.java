// class pro
// {
//     public static void main(String[] args) {

//         for( int i = 0; i<=10; i++)
//          System.out.println(i);
//     }
// }

// class pro 
// {
//     public static void main(String[] args) {
//         int i;
//         i =1;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// question1 
//  import java.util.Scanner;
//  class findnumber
//  {
//     public static void main(String[] args) {
//         int a ,i ,sum=0; 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         a = sc.nextInt()
// ;        i = 1;
//         while(i<= a){
//         sum= sum+i;
//         i = i+1;

//     }
//     System.out.println("sum of is :"+sum);

//     }
//  }

// import java.util.Scanner;

// class second12
//  {
//     public static void main(String[] args) {
//         int a, n, add = 0;
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         n = 1;
//         while (n <= a ) {
//             add = add + 1;
//             System.out.println("Addition:" + add);
//             n= n+1;

//         }

//     }
// }






//    WHILE LOOP
// import java.util.Scanner;
// class summer
// {
//     public static void main(String[] args) {
//         int i,a,sum =0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         a = sc.nextInt();
        
//         i = 1;
//         while(i<=a){
//             sum= sum +i;
//         i=i+1;
//         }
//             System.out.println("Sum of natural number is :" + sum );

        
//     }
// }




// import java.util.Scanner;
// class natural
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i,a ,sum=0;
//         System.out.print("Enter a number:");
//         a = sc.nextInt();
//         i = 1;
//          while (i<=a){
//             sum =  sum + i;
//             i = i+1;
            
            
//         }
        
//         System.out.println("sum number is :"+sum);

//     }
// }



// DO WHILE

// import java.util.Scanner;
//  class dowhileloop
//  {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a,b,sum=0;
//         System.out.println("enter  number:");
//         a = sc.nextInt();
//         b =1;
//         do 
//         {
//             System.out.println( "sum of numbber is =" + b);
//             sum = sum +b;
//             b= b+1;

//         } while(b<=10);

//     }
//  }


// Reverse

import java.util.Scanner;
 class Reverse
 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a , b=0 ;
        System.out.println("Enter a number;");
        a = sc .nextInt();
     
        while (a > 0) {
            b = ( b * 10)+ a%10;
            a = a/10;
            

            
        }
        System.out.println("sum of vale is="+b);
    }
 }