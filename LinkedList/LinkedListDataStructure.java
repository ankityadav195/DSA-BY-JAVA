package LinkedList;

// class Node {
//     int val;
//     Node next;

//     Node(int val) {
//         this.val = val;
//     }

// }
class link {
    Node head; // null
    Node tail; // null

    void addAtTail(int x) {
        Node temp = new Node(x);
        if (tail == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }

    }

    void addAtHead(int y) {
        Node temp = new Node(y);
        if (tail == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;

        }

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

    void delete() {
        if (head == null) {
            System.out.println("LinkedLst in empty");
        }
        head = head.next;
        if(head == null) tail = null;
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
        ll.addAtHead(50); ll.disply();
        ll.addAtHead(60); ll.disply();
        ll.delete();
        ll.disply();

    }

}
