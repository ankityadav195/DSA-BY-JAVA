package Array2d;

// import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        //  int [] [] arr = new int[3][4];
        int [] [] arr =  {{4,0,5,4},{1,4,0,9},{4,6,2,4}};
        for(int i =0 ; i<arr.length;i++){
            for(int j = 0 ; j <arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}



// user intput of 2D array

// public class input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a your rows elements : ");
//         int row = sc.nextInt();

//         System.out.print("Enter a your col elements : ");
//         int col = sc.nextInt();

//         System.out.print("Enter a  elements");
//         int[][] arr = new int[row][col];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }
//  public class input{
//     public static void main(String[] args) {
        

 
// int arr[] [] = {{4,0,5,4},{1,4,0,9},{4,6,2,4}};
// int sum = 0 ; 
// for(int i = 0;i<arr.length; i++){
//     for(int j = 0 ; j<arr[0].length;j++){
//         sum = sum+arr[i][j];
//     }
// }
// System.out.println(sum);
//  }
// }