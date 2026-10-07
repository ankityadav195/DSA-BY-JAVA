package Revision;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            if(n%5==0 &&  (n%3==0)){
                 System.out.print("its divisible by 5 or 3 ");
            }
            else  {
                System.out.print("its not divisible ");
            }
            sc.close();
              
            
        }
    }
    
}
