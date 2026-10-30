package stacks;
import java.util.Stack;

public class first {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("ankit");
        st.push("aditiya ");
        st.push("Ram");
        st.push("Sita");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.push("Hanuman"));
         System.out.println(st);

  
    }
    
}
