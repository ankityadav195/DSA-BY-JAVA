// import java .util.Scanner;
// class trans
// {
//     int a[][] = new int[3][3];
//     int i , j ;
//     void getdata()
//     {
//         Scanner sc = new Scanner(System.in);
//     for( i = 0; i< 3; i++)
//     {
//         for(j = 0; j <3 ; j++)
//         {
//             System.out.println("Enter a number : ");
            
//             a[i][j]= sc.nextInt();
//         }
//     }

// }
// void putdata ()
// {
//     int i , j ; 
//      for( i = 0; i< 3; i++)
//     {
//         for(j = 0; j <3 ; j++)
//         {
//             System.out.print(a[i][j]);
            
//            System.out.println();
//         }
//     }
// }
//  void sort ()
//  {
//     System.out.println("transpore is  : ");
//     for ( i = 0 ; i < 3 ; i++)
//     {
//         for ( j = 0 ; j < 3 ; j++)
//         {
//             System.out.print(a[j] [i] + "    ");
//             System.out.println();
//         }
//     }

//  }

// }
// class trans2 
// {
// public static void main(String[] args) {
//     trans aa = new trans();
//     aa.getdata();
//     System.out.print("Original matrix ");
//     aa.putdata();
//     aa.sort();
// }
// }

//  2nd method 

// import java .util.Scanner;
//  class trans
//  {
//     int i ,j ;
//     int a [][] = new int[3][3];
//     int b [] [] = new int [3] [3];
//     void getdata ()
//     {
//         Scanner sc = new Scanner(System.in);
//         for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             {
//                 System.out.println("Enter a number : ");
//                 a[i] [j] = sc.nextInt();

//             }
//         }
//     }
//     void putdata ()
//     {
//         for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             {
//                 System.out.println(a[i] [j] + " ");
//                 System.out.println();
//     }
//  }
// }
// void sort ()
// {
//      for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             { 
//                  b [i] [j] = a [j] [i];

// }
//  }
//  System.out.println("transpose is");
//   for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             {
//                 System.out.println( b[i] [j] + "  ");
//                 System.out.println( );

// }
//  }
// }
//  }

//  class trans2 
//  {
//     public static void main(String[] args) {
//         trans aa = new trans();
//         aa.getdata();
//         System.out.println("original matrix ");
//         aa.putdata();
//         aa.sort();
//     }
//  }


//  3rd method to change the index 

// import java .util.Scanner;
//  class trans
//  {
//     int i ,j ;
//     int a [][] = new int[3][3];
//     int b [] [] = new int [3] [3];
//     void getdata ()
//     {
//         Scanner sc = new Scanner(System.in);
//         for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             {
//                 System.out.println("Enter a number : ");
//                 a[i] [j] = sc.nextInt();

//             }
//         }
//     }
//     void putdata ()
//     {
//         for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             {
//                 System.out.println(a[i] [j] + " ");
//                 System.out.println();
//     }
//  }
//  }
//   void sort ()
//  {
//     int t= 0;
//      for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             { 
//                if( j>i )
//                {
//                 t = a[i] [j];
//                 a[i] [j] = a[j][i];
//                 a[j] [i] =t;
//                }
//  }
//  System.out.println("transpose is");
//   for ( i = 0 ; i < 3 ; i++)
//         {
//             for (j = 0 ; j < 3 ; j ++)
//             {
//                 System.out.println( b[i] [j] + "  ");
//                 System.out.println( );

//  }
//  }
//  }
//  }
// }

//  class trans2 
//  {
//     public static void main(String[] args) {
//         trans aa = new trans();
//         aa.getdata();
//         System.out.println("original matrix ");
//         aa.putdata();
//         aa.sort();
//     }
//  }
