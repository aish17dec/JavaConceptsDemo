package LinkedList;

public class SinglyLinkedListDemo {

    Node head;
    private final String hi = "hi";

    public static void main(String[] args) {
        SinglyLinkedListDemo ll = new SinglyLinkedListDemo();
        ll.head = null;
        InsertFirst(1,ll);
        InsertLast(2, ll);
        InsertLast(3,ll);
        InsertLast(4,ll);
        InsertLast(5,ll);
        InsertLast(6,ll);
        //display(ll);

        display(ll);
        ll.head = reverseLLRecursion(null,ll.head,ll.head.next);
        display(ll);
    }

    //recursively reverse linked list
    static Node reverseLLRecursion(Node p, Node c, Node n){
        if(c == null){
            return p;
        }

        c.next = p;
        p = c;
        c = n;
        if(n!=null)
            n = n.next;
        return reverseLLRecursion(p,c,n);
    }

    static void InsertFirst(int n, SinglyLinkedListDemo ll){
        Node node = new Node(n);
        if(ll.head==null)
            ll.head = node;
        else{
            node.next = ll.head;
            ll.head=node;
        }
    }

    static void InsertLast(int n, SinglyLinkedListDemo ll){
        Node temp = ll.head;

        while(temp.next!=null){
            temp = temp.next;
        }

        Node node = new Node(n);
        temp.next = node;
    }

    static void InsertAtIndex(int n, SinglyLinkedListDemo ll, int index){
        Node temp = ll.head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }

        Node node = new Node(n);
        node.next = temp.next;
        temp.next = node;
    }

    static void deleteFirst(SinglyLinkedListDemo ll){
        ll.head = ll.head.next;
        display(ll);
    }

    static void deleteLast(SinglyLinkedListDemo ll){
        Node temp = ll.head;
        Node prev = temp;

        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;

        display(ll);
    }

    static void display(SinglyLinkedListDemo ll){
        Node temp =ll.head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    static int getElementAtIndex(SinglyLinkedListDemo ll, int j){
        Node temp = ll.head;

        for(int i = 0; i<=j; i++){
            if(i==j)
                return temp.value;
            temp = temp.next;
        }
        return -1;
    }

    static boolean find(int n, SinglyLinkedListDemo ll){
        Node temp = ll.head;

        while(temp!=null){
            if(temp.value == n)
                return true;
            temp = temp.next;
        }
        return false;
    }

    static int findLength(SinglyLinkedListDemo ll){
        int length = 0;

        Node node  = ll.head;

        while(node!=null){
            length++;
            node = node.next;
        }

        return length;
    }

    static void reverseLinkedList(SinglyLinkedListDemo ll){
        Node p = null;
        Node c = ll.head;
        Node n = ll.head.next;

        while(c!=null){
            c.next = p;
            p = c;
            c = n;
            if(n!=null)
                n = n.next;
        }

        ll.head = p;
    }
}


class Node{
    int value;
    Node next;

    public Node(int value, Node node){
        this.value = value;
        this.next = node;
    }

    public Node(int value){
        this.value = value;
    }
}
