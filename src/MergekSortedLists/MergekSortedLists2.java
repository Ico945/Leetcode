package MergekSortedLists;

public class MergekSortedLists2 {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(2);lists[0].next = null;//new ListNode(2);lists[0].next.next = new ListNode(2);lists[0].next.next.next = null;
        lists[1] = null;//new ListNode(1);lists[1].next = null;//new ListNode(1);lists[1].next.next = new ListNode(2);lists[1].next.next.next = null;
        lists[2] = new ListNode(-1);lists[2].next = null;
        ListNode p = new MergekSortedLists2().mergeKLists(lists);
        while (p!=null){
            System.out.println(p.val);
            p = p.next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        int i,j = lists.length,count = 1;
        while (j>1){
            count *= 2;
            i = 0;
            while (i<lists.length){
                deal(lists,i,count/2);
                i += count;
            }
            j = j/2+j%2;
        }
        return lists[0];
    }
    public void deal(ListNode[] lists,int i,int j){
        if(lists[i]==null){
            if(i+j<=lists.length-1&&lists[i+j]!=null)
                lists[i] = lists[i+j];
            return;
        }
        if(i+j>lists.length-1||lists[i+j]==null)
            return;
        ListNode l1 = lists[i],l2 = lists[i+j];
        ListNode p = new ListNode(0);
        lists[i] = lists[i].val<=lists[i+j].val?lists[i]:lists[i+j];
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                p.next = l1;
                l1 = l1.next;
            }
            else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1==null)
            p.next = l2;
        else p.next = l1;
    }
}
