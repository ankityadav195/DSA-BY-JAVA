import java.util.Scanner;
class star2
 {
 public static void main(String[] args) {
     int i , n , j, s  ; 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number  : ");

       n   = sc .nextInt();
        for (   i = 1 ; i <= n ; i ++ )
        {
            for (s =1 ; s <=n -i ;  s++)
                System.out.print(" ");

            for ( j = 1 ; j <= i ; j++)
            
                System.out.print("*");  // j , i , "*"
            
            System.out.println();

        }

 }
} 

// import java.util.Scanner;
// class ankit
//  {
//  public static void main(String[] args) {
//      int i , n , j, s, k=1  ; 
//     Scanner sc = new Scanner(System.in); 
//     System.out.println("Enter a number  : ");

//        n   = sc .nextInt();
//         for (   i = 1 ; i <= n ; i ++ )
//         {
//             for (s =1 ; s <=n ;  s++)
//                 System.out.print(" ");  
            
//             for ( j = 1 ; j <= i ; j++)
                
//                 System.out.print(j);  // j , i , "*"
//                 // k = k +1  ;
            
//             System.out.println();    

//         }    

//  }       
// }  

