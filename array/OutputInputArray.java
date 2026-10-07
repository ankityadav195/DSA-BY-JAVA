package array;

import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int [] arr = {23,654,76,74,-13,74,143};
        // // System.out.println(arr.length);
        // int n = arr.length;
        // for(int i =0; i<=n; i++){
        //     System.out.print(arr[i] + " ");

        // }

        // default value
        // int [] ankit = new int[8];
        // for(int i = 0 ; i <= 7; i++){
        //     System.out.print(ankit[i]+" ");
        // }


        //input 
           int [] ankit = new int[8];
        for(int i = 0 ; i <8 ;i++){
          ankit[i] = sc.nextInt();
        }


            // print
            for(int i = 0 ; i<8 ;i++){
            System.out.print(ankit[i]+" ");
        }
    



 sc.close();




 
    }
    
}
