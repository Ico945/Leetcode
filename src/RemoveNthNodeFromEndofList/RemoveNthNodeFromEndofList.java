package RemoveNthNodeFromEndofList;

import java.util.List;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        head.next = second;
        second.next = null;
        ListNode result = new RemoveNthNodeFromEndofList().removeNthFromEnd(head,1);
        while (result!=null)
        {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode slow = pre;
        ListNode fast = pre;
        while (n>0)
        {
            fast = fast.next;
            n--;
        }
        while (fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return pre.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
