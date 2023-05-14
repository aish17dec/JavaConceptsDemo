package LinkedList;

public class ReverseDoublyLinkedList {
    static class Node
    {
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node reverseDLL(Node  head)
    {
        //Your code here
        //find last node
        Node l = head;
        while(l.next!=null){
            l = l.next;
        }
        head = l;
        Node temp = null;
        while(l!=null){
            temp = l.prev;
            l.prev = l.next;
            l.next = temp;
            l = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        Node n1 , n2, n3;
        n1 =  new Node(3);
        n2 =  new Node(4);
        n3 =  new Node(5);
        n1.prev = null;
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = null;

        reverseDLL(n1);

    }
}
