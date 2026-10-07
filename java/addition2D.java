// import java.util.Scanner;
// class addtion 
// {
//     int a [] [] = new int[3][3];
//     int b [] [] = new int[3][3];
//     int c [] [] = new int[3][3];
//     void getdata()
//     {
//         Scanner sc = new Scanner(System.in);
//         int i, j ;
//         i = j = 0;
//         System.out.println("Enter a first  number :");
//         for(i = 0 ; i<3 ; i++)
//         for(i = 0 ; i<3 ; i++)
//         {
//             a[i][j] = sc.nextInt();
//     }
//     System.out.println("enter a second number : ");
//             for(i = 0 ; i<3 ; i++)
//             for(j = 0 ; j<3 ; j++)
//         {
//             b[i][j] = sc.nextInt();
//                 }


// }

// void add ()
// {
//     int i, j ;
//     for(i = 0 ; i<3 ; i++)
//        for(j = 0 ; j<3 ; j++)
//     {
//         c[i] [j] = a[i][j] + b[i][j];
//         System.out.print(  c[i][j]+ " ");
//     }
//     System.out.println();
// }
// }



// class addit
// {
//     public static void main(String[] args) {
//         addtion obj = new addtion();
//         obj.getdata();

//         obj.add();
        
//     }
// }



import java.util.Scanner;

class Add2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        int i, j;

        // First matrix input
        System.out.println("Enter elements of first matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Second matrix input
        System.out.println("Enter elements of second matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Output
        System.out.println("Sum of two matrices:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
