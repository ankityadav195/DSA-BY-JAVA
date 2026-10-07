package array;
import java.util.Scanner;

public class college {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        
        int[] ankit = new int[n];
        
        int max = ankit[0];
        int min = ankit[0];
        System.out.println("Enter a number of elements: ");
        for (int i = 0; i <n ; i++) {
            ankit[i] =  sc.nextInt();
           
        }
        for(int i = 0 ; i<n;  i++){
             if(ankit[i]>max)
            
            max = ankit[i];

        }
        System.out.println(max + " ");


        for(int i= 0 ; i <n ; i++){
            
            if(ankit[i] < min)
                min = ankit[i];
        

        System.out.print(min+ " ");
        System.out.print(max+ " ");
    sc.close();
    }
}
}

