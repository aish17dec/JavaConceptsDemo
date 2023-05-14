package LinkedList;

public class DetectCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next= e;
        e.next = f;
        f.next = c;

        System.out.println(detectCycle(a).val);
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f!=null || f.next!=null){
            s = s.next;
            f = f.next.next;
            if(s==f)
                break;
        }

        if(f==null || f.next==null)
            return null;

        int n = findLengthOfLoop(s);

        int i = 1;
        s = head;
        f = head;

        while(i<=n){
            s = s.next;
            i++;
        }

        while(s!=f){
            s = s.next;
            f = f.next;
        }

        return s;
    }

    static int findLengthOfLoop(ListNode temp){
        int count = 1;
        ListNode temp2 = temp.next;

        while(temp2!=temp){
            count++;
            temp2 = temp2.next;
        }
        return count;
    }
}


