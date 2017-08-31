package RemoveDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.print(new RemoveDuplicatesfromSortedArray().removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        int count = 1;
        if(nums.length<2)
            return nums.length;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1])
                count++;
        }
        return count;
    }
}
