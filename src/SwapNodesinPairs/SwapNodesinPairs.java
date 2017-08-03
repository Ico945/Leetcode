package SwapNodesinPairs;

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class SwapNodesinPairs {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = null;
        ListNode p = new SwapNodesinPairs().swapPairs(list1);
        while(p != null)
        {
            System.out.println(p.val);
            p = p.next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode after = head;
        ListNode p = head;
        if(head == null)
            return null;
        else {
            ListNode result = head.next;
            if(head.next == null)
                return head;
            else {
                while (p != null)
                {
                    if(p.next != null)
                    {
                        after = p.next.next;
                        p.next.next = p;
                    }
                    else
                        after = null;
                    p.next = after;
                    ListNode pre = p;
                    p = after;
                    pre.next = p;
                    if(p != null && p.next != null)
                        pre.next = p.next;
                }
                return result;
            }
        }
    }
}
