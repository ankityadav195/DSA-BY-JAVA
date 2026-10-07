package Strings;

public class InterningNew {
    public static void main(String[] args) {
        // String s1 = "ankit";
        // String s2 ="ankit";
        // System.out.print(s1==s2);
        // return is true;
        

        //  String s1 = new String("ankit");
        // String s2 =new String("ankit");
        // System.out.print(s1==s2);
        // return is false;

        
         String s1 = new String("ankit");
        String s2 =new String("ankit");
        System.out.print(s1.equals( s2));
    }
    
}
