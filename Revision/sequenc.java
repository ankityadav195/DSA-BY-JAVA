// package Revision;

// import java.util.Scanner;

// public class sequenc {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a element: ");
//         int n = sc.nextInt();
//         int a = 1 , b= n;
//         for(int i = 1; i<=n ; i++){
//         if(i%2!=0){
//             System.out.print(a +" ");
//         a++;
//         }else{

//                 System.out.print( b+" ");
//             b--;

//             }
//         }
//     }
    
// }


package Revision;

import java.util.Scanner;

public class sequenc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element: ");
        int n = sc.nextInt();

        int a = 1, b = n;

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.print(a + " ");
                a++;
            } else {
                System.out.print(b + " ");
                b--;
            }
        }
        sc.close();
    }
}
