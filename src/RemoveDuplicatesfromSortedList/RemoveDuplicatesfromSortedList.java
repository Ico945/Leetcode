package RemoveDuplicatesfromSortedList;

public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(2);
        ListNode four = new ListNode(3);
        ListNode five = new ListNode(3);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;
        new RemoveDuplicatesfromSortedList().deleteDuplicates(one);
        while (one != null)
        {
            System.out.println(one.val);
            one = one.next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        if(pre == null||pre.next == null)
            return pre;
        ListNode p = pre.next;
        while(p != null)
        {
            while (p != null&&pre.val == p.val)
                p = p.next;
            if(p == null)
                break;
            if(pre.next!=p)
                pre.next = p;
            pre = pre.next;
            p = p.next;
        }
        pre.next = null;
        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }