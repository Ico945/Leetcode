package LinkedListCycleII;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        while (p != null)
        {
            if(p.val == 123456)
                return p;
            else
            {
                p.val = 123456;
                p = p.next;
            }
        }
        return null;
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