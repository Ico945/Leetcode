package MaximumSubarray;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new MaximumSubarray().maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        if(nums.length<2)
            return nums[0];
        int maxsum = nums[0],sum;
        for(int j = 0;j<nums.length;j++){
            maxsum = Math.max(maxsum,nums[j]);
            sum = 0;
            for(int i = j;i<nums.length;i++){
                sum += nums[i];
                maxsum = Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}
