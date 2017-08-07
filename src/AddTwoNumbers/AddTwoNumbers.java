package AddTwoNumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(8);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = null;

        ListNode l2 = new ListNode(2);
        //l2.next = new ListNode(6);
        //l2.next.next = new ListNode(4);
        l2.next = null;

        System.out.println(new AddTwoNumbers().addTwoNumbers(l1,l2).val);
        System.out.println(new AddTwoNumbers().addTwoNumbers(l1,l2).next.val);
        System.out.println(new AddTwoNumbers().addTwoNumbers(l1,l2).next.next.val);
        System.out.println(new AddTwoNumbers().addTwoNumbers(l1,l2).next.next.next.val);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        ListNode pre = new ListNode(0);
        pre.next = l1;
        int count = 0;
        while (l1 != null && l2 != null) {
            int temp1 = l1.val;
            int temp2 = l2.val;
            l1.val = (l1.val + l2.val + count) % 10;
            count = (temp1 + temp2 + count) / 10;
            pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l2 != null)
        {
            pre.next = l2;
            l1 = l2;
        }
        while (l1 != null)
        {
            l1.val += count;
            count = l1.val/10;
            l1.val = l1.val%10;
            pre = l1;
            l1 = l1.next;
        }
        if (count == 1)
            pre.next = new ListNode(1);
        return result;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}