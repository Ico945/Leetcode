package MaximumAverageSubarrayI;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {5};
        int k = 1;
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i = 0;i<k;i++)
            sum += nums[i];
        double maxsum = sum;
        for(int i = k;i<nums.length;i++)
        {
            sum += nums[i]-nums[i-k];
            if(sum>maxsum)
                maxsum = sum;
        }
        return maxsum/k;
    }
}
