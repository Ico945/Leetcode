package RotateList;
import NewList.NewList;
import ListNode.ListNode;

public class RotateList {
    public static void main(String[] args) {
        int[] nums = {1,2};
        ListNode head = new NewList().New(nums);
        ListNode result = new RotateList().rotateRight(head,2);
        while (result!=null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int len = 0;
        ListNode first = head,last = head;
        while (last!=null){
            last = last.next;
            len++;
        }
        last = head;
        k = k%len;
        while (k>0){
            last = last.next;
            k--;
        }
        while (last.next!=null){
            first = first.next;
            last = last.next;
        }
        last.next = head;
        head = first.next;
        first.next = null;
        return head;
    }
}