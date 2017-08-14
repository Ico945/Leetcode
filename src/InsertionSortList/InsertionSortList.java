package InsertionSortList;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null)
            return head;
        ListNode res = new ListNode(0);
        ListNode p = head,pre = res,next = null;
        while(p != null)
        {
            next = p.next;
            while (pre.next != null&&pre.next.val<p.val)
                pre = pre.next;
            p.next = pre.next;
            pre.next = p;
            p = next;
            pre = res;
        }
        return res.next;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
