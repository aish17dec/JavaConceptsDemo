package LinkedList;

public class CircularLinkedList {
    Node head;
    Node tail;

     class Node{
        int value;
        Node next;

        public Node(int n){
            this.value = n;
        }
    }

    public void insertFirst(int n){
        Node node = new Node(n);

        if(this.head == null){
            this.head = node;
            this.tail = node;
            node.next = node;
        }else{
            this.tail.next = node;
            node.next = this.head;
            this.head = node;
        }
    }

    public void display(){
        System.out.println(this.head.value);
        Node temp = this.head.next;

        while(temp!=this.head){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void deleteElement(int n){
         if(head.value == n){
             tail.next = head.next;
             head = head.next;
         }else{
             Node temp = head.next;
             Node prev = head;

             while (temp!=head){
                 if(temp.value == n){
                     prev.next = temp.next;
                     break;
                 }
                 prev = temp;
                 temp = temp.next;
             }
         }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertFirst(5);
        cll.insertFirst(4);
        cll.insertFirst(3);
        cll.insertFirst(2);
        cll.insertFirst(1);

        cll.display();
        System.out.println("After deleting 3:");
        cll.deleteElement(3);
        cll.display();

        System.out.println("After deleting 1:");
        cll.deleteElement(1);
        cll.display();

        System.out.println("After deleting 5:");
        cll.deleteElement(5);
        cll.display();
    }
}
