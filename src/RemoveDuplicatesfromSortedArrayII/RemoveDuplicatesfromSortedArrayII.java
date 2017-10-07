/*
package RemoveDuplicatesfromSortedArrayII;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(new RemoveDuplicatesfromSortedArrayII().removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1)
            return nums.length;
        int sum = 0;
        int count = 1;
        for(int i = 0;i<nums.length-1;i++){
            while (i<nums.length-1&&nums[i]==nums[i+1]) {
                count++;
                i++;
                if(count>2){
                    count = 2;
                    break;
                }
            }
            sum += count;
            count = 1;
        }
        return sum;
    }
}
*/
