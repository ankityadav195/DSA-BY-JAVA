package Recursion;

public class Reverse {
    public static void reverse(int n, int r){
        if(n==0){
            System.out.print(r);
        return;
        }
            reverse(n/10,r*10+n%10);

        
    }
    public static void main(String[] args) {
         int n = 12397445;

      reverse(n, 0);
    }
    
}
