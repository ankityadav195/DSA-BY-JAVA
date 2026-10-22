package LinkedList;

class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class link {

    Node head; // null
    Node tail; // null
    int size = 0;

    void addAtTail(int x) {

        Node temp = new Node(x);

        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    void addAtHead(int y) {

        Node temp = new Node(y);

        if (tail == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    void disply() {

        if (head == null)
            return;

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    void deleteATHead() {

        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        head = head.next;

        if (head == null)
            tail = null;

        size--;
    }

    void insert(int val, int idx) {

        // index 0 se size tak valid hai
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            addAtHead(val);
        }

        else if (idx == size) {
            addAtTail(val);
        }

        else {

            Node temp = head;

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            Node t = new Node(val);

            t.next = temp.next;
            temp.next = t;

            size++;
        }
    }
    void deleteval(int idx){
        if(idx == 0 || idx >= size){
            System.out.println("Inavaild index ");
            return ;
        }
        if(idx == 0 ){
        deleteATHead();
        return;
        }

        Node temp = head;
        for(int i = 1;  i<= idx-1; i++){
            temp = temp.next;

         }
         temp.next = temp.next.next; //delete
         if(idx==size-1) tail = temp ; // we are delete tail 
         size--;
    }
}

public class LinkedListDataStructure {

    public static void main(String[] args) {

        link ll = new link();

        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);

        ll.disply();

        ll.addAtHead(50);
        ll.disply();

        ll.addAtHead(60);
        ll.disply();

        ll.deleteATHead();
        ll.disply();

        ll.insert(45, 2);
        ll.disply();

        ll.deleteval(3);
    }
}