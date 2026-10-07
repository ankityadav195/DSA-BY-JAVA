package array;
import java.util.Scanner;

public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        int [] ankit = new int[n];
        System.out.print("Enter a number element : ");
        for(int i = 0 ; i<n ; i++){
            ankit[i] =sc.nextInt();
        

        }
        for(int i = 0 ; i<n; i++){
            if(ankit[i]<0) System.out.print(ankit[i] + " ");
            sc.close();
        }
    }

    
}
