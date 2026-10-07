package Recusrion2;

public class TowerGame {
    public static void main(String[] args) {
        honoy(3,'A','B','C');
    }
    public static void honoy(int n, char a,char b, char c){
        if(n==0) return;
        honoy(n-1,a,c,b);
        System.out.println(a + " ->"+ c);
        honoy(n-1,b,a,c);

    }
    
}



// class Solution {

//     static int count;

//     public int towerOfHanoi(int n, int from, int to, int aux) {
//         count = 0;
//         hanoi(n, from, to, aux);
//         return count;
//     }

//     public static void hanoi(int n, int from, int to, int aux) {
//         if (n == 0) return;

//         hanoi(n - 1, from, aux, to);

//         count++; // move disk

//         hanoi(n - 1, aux, to, from);
//     }
// }