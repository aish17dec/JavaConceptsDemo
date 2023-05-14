package Recursion;

public class LinkedListPallindrome {

      static class ListNode {
         int val;
        ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    static ListNode fixedHead;
    public boolean isPalindrome(ListNode head) {
        fixedHead = head;
        return checkPal(head);
    }

    public boolean checkPal(ListNode c){
        if(c == null)
            return true;

        if(!checkPal(c.next)){
                return false;
        }else{
            if(c.val!=fixedHead.val)
                return false;
        }

        fixedHead = fixedHead.next;
        return true;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1, l1);

        System.out.println(new LinkedListPallindrome().isPalindrome(l2));
    }
}
