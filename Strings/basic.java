package Strings;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        char [] arr = {'a','n','k','i','t','y','a','d','a','v'};
        for(char ele : arr)
            System.out.print(ele+" ");
        Scanner scanner = new Scanner(System.in);

        String ac =  scanner.nextLine();

        scanner.close();
        System.out.print( ac );

                String ar = "ankit";

                System.out.print(ar.charAt(2));

    }
    
}
