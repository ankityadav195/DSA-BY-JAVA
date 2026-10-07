// import java.util.Scanner;
// class twodin
// {
//     int a[][] =new int[3] [3];
//     void getdata ()
//     {
//         Scanner sc = new Scanner(System.in);
//         int i , j;
//         i = j = 0;
//         for( i = 0 ; i <3 ; i++)
        
//         for(j = 0 ; j <3 ; j++)
//     {
//         System.out.println("Enter number : ");
//         a [i] [j] = sc.nextInt();
//     }
        
//     }

// void putdata ()
// {
//     int i , j ; 
//     i = j = 0;
//     for ( i = 0 ; i < 3 ; i++)
//     {
//         for ( j = 0 ; j < 3 ; j++)
//         {
//         System.out.print(a[i][j]+ " ");
//     }
//     System.out.println();

// }

// }

// }

// class xy
// {
//     public static void main(String[] args) {
//         twodin aa =  new twodin();
//         aa.getdata();
//         aa.putdata();
//     }
// }

import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        
        // Input
        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("2D Array elements are:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
