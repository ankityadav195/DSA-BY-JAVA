// import java.util.Scanner;
// class addnumber
// {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a, sum=0;
//         System.out.println("Enter a number:");
//         a = sc.nextInt();
//         while (a > 0){
//             sum = sum +  a % 10;
//             a = a /10;

//         }
//         System.out.println( "sum of vale is = " + sum );


//     }
//}

// import java.util.Scanner;
// class demo
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a,  sum=0, pro = 1, digit ;
//         System.out.println("Enter a numbre :");
//         a = sc.nextInt();
//         while(a > 0)
//         {
//             digit = a % 10;
//             if(digit%2==0) 
//                 sum = sum + digit;
//             else 
//                 pro = pro *digit;
//                 a = a /10;
 
//         }
//         System.out.println("sum of enter number =" + sum);
//         System.out.println("sum of enter number =" +pro);

//     }
// }


// palindrome number ( 727 = 727) aage piche se dono number same hona chaiye



// import java.util.Scanner;
// class palindrome
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a ,rev= 0,  z;
//         System.out.println("Enter a number:");
//         a = sc.nextInt();
//         z = a;
//         while( a > 0)
//         {
//             rev =(rev * 10)+  a % 10;
//             a = a / 10;
//         }
//         if(rev == z)
//         System.out.println("this is a palindrome");
//     else 
//         System.out.println("this is a not  palindrome");


//     }
// }

// prodeuct of number

// import java.util.Scanner;
// class product
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a, sum=1;
//         System.out.println("Enter a number:");
//         a = sc.nextInt();
//         while (a > 0 ) 
//             {
              
//                 sum = sum *  a % 10 ;
//                 a = a/ 10;
            
//         }
//         System.out.println( " product of number is;"+sum );

//     }
// }
 


// prime number

// import java.util.Scanner;
// class product
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a, sum=1 , n ; // a = 12345657
//         System.out.println("Enter a number:");
//         a = sc.nextInt();
//         n =1;
//         while(n <= a)
//         {
//             if(a % n==0)
//                 sum = sum +1;
//             n = n+1;

//         }
//         if  ( sum ==2)
        
//         System.out.println(" prime number" );
//     else
//             System.out.println("  not prime number");
//     }
//  }

//factorial number

// import java.util.Scanner;
// class factorial
// {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int a , fact = 1;
//         System.out.println("Enter a number :");
//         a = sc.nextInt();
//         while( a > 0){
//             fact = fact * a;
//             a = a -1;
//         }

//          System.out.println("sum of product number:" + fact);

//     }
// }


//prime number (1-100)

//  class prime{
//     public static void main(String[] args) {
//         int i ,j, count;
//         for( i = 1; i <= 100; i++)
//         {
//             count = 0; 
//             for ( j= 1; j<=i; j ++)
//             {
//             if (i % j == 0)
//                 count++;
//         }
//         if ( count == 2)
//             System.out.println(i);
//         }
        

//     }
//  }

// class primenumber
// {
//     public static void main(String[] args) {
//         int i , j , cout;
//         for(i= 1; i <=100; i++){
//             cout=0;
//         for(j = 1; j<i; j++ )
//         {
//           if(i % j ==0)
//             cout++;
//         }
//         if(cout==2)
//         Systerm.out.println(i);



//     }
// }
// }


// import java.util.Scanner;
// class primenumber
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i , j, cout,n;
//         System.out.println("Enter number: ");
//         n = sc.nextInt();
//         for(i = 1; i<=n; i++)
//         {
//             cout =0;
//              for(j = 1 ; j<i ; j++)
//              {
//                  if ( i % j == 0);
//                 cout++;
//              }
//              if ( cout ==2);
//             }
            
//             System.out.println(i);
//         }
// }
    

//table 
// import java.util.Scanner;
// class table
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a , b=1;
//         System.out.println("Enter a number:");
//         a = sc.nextInt();

// while (b <10) {
//     System.out.println (a * b); 
//     b = b +1;
// }
//     }
// }



// import java.util.Scanner;
// class table
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=0 , b=1 ,c =0, n ;
//         System.out.println("Enter a number:");
//         n = sc.nextInt();
//         while(c <= n)
//         {
//             System.out.println(c);
//             a = b;
//             b = c;
//             c = a + b;

//         }
//     }
// }





 // fibnochi number is term 

//  import java.util.Scanner;
// class fibnocci 
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=0 , b=1, c= 0, n, term=1;
//         System.out.println("Enter a number:");
//         n = sc.nextInt();
//         while(term <= n)
//         {
//             System.out.println(c);
//             a = b; 
//             b= c;
//             c = a+b;
//             term= term+1;

            
//         }
//     }
// }


// import java.util.Scanner;
// class power 
// {
//     public static void main(String[] args) {
//         int x , y;

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number :");
//     x = sc.nextInt();
//      y = x*x;
     
//      System.out.println("squre of a number :"+ y );



//     }
// }


// import java.util.Scanner;
// class find 
// {
//     public static void main(String[] args) {
        
//         int x , y, c =1  ;
//         Scanner sc  = new Scanner(System.in) ;
//         System.out.println("Enter a base  :");
//         x = sc.nextInt();
//         System.out.println("Enter a power  :");
//         y = sc.nextInt();
//         for (; y >0 ; y--)
//         {
//             c = c * x ;
//         }
//         // while (y > 0 )
//         // {
//         //     c = c * x ;
//         //      y --;
//         // }
//          System.out.println("squre a number is :" + c);
//     }
// }

// class demo
// {
//     public static void main(String[] args) {
//         int i ;
//         i = 0;
//         while (i <=10 )
//         {
//             i = i + 1 ;
            
//             if ( i  == 5 )
//                 // break ; 
//             continue;
            
//             System.out.println( i );
//         }

//     }
// }