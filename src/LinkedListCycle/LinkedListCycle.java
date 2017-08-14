package LinkedListCycle;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;
        while (p != null)
        {
            if(p.val == 123456)
                return true;
            else
            {
                p.val = 123456;
                p = p.next;
            }
        }
        return false;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }