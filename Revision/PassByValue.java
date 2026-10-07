package Revision;

public class PassByValue {
    public static void plan(int x){
        x=10;
        // System.out.println(x);
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        plan(x);
        System.out.println(x);
    }
    
}
