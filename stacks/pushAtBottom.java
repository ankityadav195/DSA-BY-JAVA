package stacks;

import java.util.Stack;

public class pushAtBottom {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.size());
        int ele = 50;
        pushatbootom(st,ele);
    }
    public static void pushatbootom(Stack <Integer> st ,int ele) {
        if(st.size() ==0){
            st.push(ele);
            return ;
        }
        int top = st.pop();
        pushatbootom(st, ele);
        st.push(top);
        
    }
    
}
