package ArrayRevision;

import java.util.Scanner;

public class _04SceondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of arrey : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter a number of arr :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
         int max = Integer.MIN_VALUE;
         int smax = Integer.MAX_VALUE;

        
        // max
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >max)
                max =arr[i];
           
        }
        // Second Max
        for(int i = 0 ;i <arr.length;i++){
            if(arr[i]<smax && arr[i] !=max){
                smax = arr[i];
            }
        }
        System.out.println("Maximum value : "+ max);
        System.out.println(" Second Maximum value : "+ smax);
        sc.close();

    }

}
