package Recursion;

public class reachTheNthStarir {
    public static void main(String[] args) {
    // int n = 5;

    }
    public static int stair(int n){
        if(n<=2) return n ;
        return stair(n-1)+ stair(n-2);

    }
    
}


//chatgpt solution 

// package Recursion;

// public class ReachTheNthStair {

//     public static int stair(int n) {
//         if (n <= 2)
//             return n;

//         return stair(n - 1) + stair(n - 2);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(stair(n));
//     }
// }
