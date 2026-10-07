package LinkedList;

// import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DisplyList {

    public static void displyRec(Node head) {
        if(head==null) return;
        System.out.println(head.val+" ");
        displyRec(head.next);
    }
       public static void disply(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next; // yeh aage vale ke address me jayega
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Node a = new Node(sc.nextInt()); // user input 

        Node a= new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        // sc.close();
        // connect kare ge
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.println(get(a,3));
        // displyRec(a);
        // disply(a);


    }
    public static int get(Node head,int  idx) {
        Node temp = head;
        for(int i = 1; i<=idx;i++){
            temp= temp.next;
        }
        return temp.val;
        
    }

}

