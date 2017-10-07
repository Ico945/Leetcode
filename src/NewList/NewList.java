package NewList;
import ListNode.ListNode;

public class NewList {
    public ListNode New(int[] nums){
        ListNode first = null;
        first = new ListNode(nums[0]);
        ListNode p = first;
        for(int i = 1;i<nums.length;i++){
            p.next = new ListNode(nums[i]);
            p = p.next;
        }
        p.next = null;
        return first;
    }
}
