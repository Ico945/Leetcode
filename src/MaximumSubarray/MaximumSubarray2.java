package MaximumSubarray;

public class MaximumSubarray2 {
    public static void main(String[] args) {
        //System.out.println(new MaximumSubarray2().maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int[] tem = new int[nums.length];
        tem[0] = nums[0];
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            tem[i] = nums[i]+(tem[i-1]>0?tem[i-1]:0);
            max = Math.max(max,tem[i]);
        }
        return max;
    }
}
