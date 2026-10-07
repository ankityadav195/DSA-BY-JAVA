package Recusrion2;

public class PreInPost {
    public static void main(String[] args) {
        pip(2);


    }
    public static void pip(int n ){
        if(n==0) return;
        System.out.print (" pre " + n +" "); // "print" 
          pip(n-1);
        System.out.print (" In "+n +" "); //IN
         pip(n-1);
       System.out.print (" Post " + n +" ");
    }
    // 2 1 1 1 2 1 1 1 2
  // 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
}
