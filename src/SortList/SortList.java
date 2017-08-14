package SortList;

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head == null&&head.next == null)
            return head;
        ListNode mid = getmid(head);
        ListNode pre = mid.next;
        mid.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(pre);
        return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode p = new ListNode(0),res_pre = p;
        while (l1 != null&&l2 != null)
        {
            if(l1.val<l2.val)
            {
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }
            else
            {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }
        if(l1 == null)
            p.next = l2;
        else p.next = l1;
        return res_pre.next;
    }
    public ListNode getmid(ListNode head)
    {
        ListNode slow = head,fast = head;
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }