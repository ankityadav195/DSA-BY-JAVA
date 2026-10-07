package Strings;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        // System.out.print("Enetr a String : ");
        // Scanner sc = new Scanner(System.in);
        // String as = sc.nextLine();
        // for(int i= 0 ; i< as.length();i++){
        // char ch = as.charAt(i);
        // if (ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' )

        // System.out.print(ch+" ");
        // }
        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String str = sc.nextLine();
        int count = 0 ;
         for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch== 'e'|| ch== 'i'|| ch== 'o'|| ch=='u'){
                count++;
                
            }
            
        }
        System.out.print(count) ;
        
       

    }

}
