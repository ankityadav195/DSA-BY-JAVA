package Recusrion2;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // String [] arr = {"nakit", "yash "," hemant","sakshi"};

        ArrayList<String> al = new ArrayList<>();
        al.add("ram");
        al.add("sita");
        al.add("lucky");
        System.out.println(al);
        change2(al);
        System.out.println(al); // passed by reference
        // character of array passed by refrence
        
       

    }
    public static void change2(ArrayList<String> al){
        al.add("harsh");
    }
    
}
