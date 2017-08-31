package RemoveDuplicatesfromSortedListII;

public class RemoveDuplicatesfromSortedListII {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        /*ListNode three = new ListNode(3);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(4);
        ListNode six = new ListNode(4);
        ListNode seven = new ListNode(5);*/
        one.next = two;
        two.next = null;
        /*three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = null;*/
        ListNode result = new RemoveDuplicatesfromSortedListII().deleteDuplicates(one);
        while (result != null)
        {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null||head.next == null)
            return head;
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode p = head;
        head = pre;
        while (p.next != null)
        {
            while (p.next != null&&p.val == p.next.val)
                p = p.next;
            if(p.next == null)
            {
                pre.next = null;
                break;
            }
            if(pre.next == p)
            {
                pre = p;
                p = p.next;
            }
            else {
                pre.next = p.next;
                if(p.next.next != null&&p.next.val != p.next.next.val)
                    pre = pre.next;
                p = pre.next;
            }
        }
        return head.next;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }