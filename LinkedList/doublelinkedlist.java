package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode pre;

    ListNode(int val) {
        this.val = val;
    }

}

class DLL {
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head.pre = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        size++;
    }

    void deleteInHead(int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = temp;
        else {
            head = head.next;
            head.pre = null;
        }
        size--;
    }

    void deleteInTail(int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = tail = temp;
        else {
            
            tail= tail.pre;
            tail.next = null;
        }
        size--;
    }

    void disply() {

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();

    }
    void displyresver() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val + " ");
            temp = temp.pre;
        }
        System.out.println();

    }



    void insertAtValu( int idx,int val ){
        if(idx <0 || idx > size){
            System.out.println("Invail idex ");
            return ;
        }
        if(idx==0){
            insertAtHead(val);
        }
        if(idx==size){
            insertAtTail(val);
            return;
        } 


        ListNode temp = head;
        ListNode a = new ListNode(val);
       if(head == null){
        head = tail = null;
          }
          for(int i = 1 ; i<= idx-1;i++){
            temp = temp.next;
          }
        ListNode h = temp.next;
        temp.next = a;
        a.pre = temp;
        a.next = h;
        h.pre = a;
        size++;


       

    }
}

public class doublelinkedlist {
    public static void main(String[] args) {
        DLL list = new DLL();
        // list.insertAtHead(10);
        // list.insertAtHead(20);
        // list.insertAtHead(30);
        // list.insertAtHead(40);
        // list.insertAtHead(50);
        // list.disply();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        // list.disply();
        // list.displyresver();

            




        // list.deleteInHead(0);
        // list.deleteInTail(0);
            list.disply();


            list.insertAtValu(2,50);
                        list.disply();


    }

}
