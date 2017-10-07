package MergekSortedLists;
import java.util.Arrays;
import java.util.Comparator;

public class MergekSortedLists {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[2];
        lists[0] = new ListNode(1);lists[0].next = new ListNode(2);lists[0].next.next = new ListNode(2);lists[0].next.next.next = null;
        lists[1] = new ListNode(1);lists[1].next = new ListNode(1);lists[1].next.next = new ListNode(2);lists[1].next.next.next = null;
        ListNode p = new MergekSortedLists().mergeKLists(lists);
        while (p!=null){
            System.out.println(p.val);
            p = p.next;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        if(lists.length==1)
            return lists[0];
        ListNode result = new ListNode(0);
        ListNode q = result;
        ListNode p = new ListNode(Integer.MAX_VALUE);
        int index = 0;
        int count = 0;
        for(int i =0;i<lists.length;i++){
            if(lists[i]!=null)
                count++;
        }
        myComprator myComprator = new myComprator();
        Arrays.sort(lists,myComprator);
        while (count>0){
            for(int i = 0;i<count;i++){
                if(lists[i]!=null&&lists[i].val<=p.val) {
                    p = lists[i];
                    index = i;
                }
            }
            q.next = p;
            p = new ListNode(Integer.MAX_VALUE);
            q = q.next;
            if(lists[index]!=null&&lists[index].next==null)
                count--;
            lists[index] = lists[index].next;
        }
        return result.next;
    }
/*    public boolean judge(ListNode[] lists){
        for(int i =0;i<lists.length;i++){
            if(lists[i]!=null)
                return false;
        }
        return true;
    }*/
}

class myComprator implements Comparator<ListNode> {
    public int compare(ListNode t1,ListNode t2) {
        if (t1 == null) {
            if(t2 == null)
                return 0;
            else return 1;
        }
        else {
            if(t2 == null)
                return -1;
            else {
                while (t1.next!=null)
                    t1 = t1.next;
                while (t2.next!=null)
                    t2 = t2.next;
                return t2.val-t1.val;
            }
        }
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
