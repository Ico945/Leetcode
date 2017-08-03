package MaximumProductofThreeNumbers;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3};
        System.out.println(new MaximumProductofThreeNumbers().maximumProduct(nums));
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length,result = nums[len-1];
        int max;
        if(result<=0)
            return result*nums[len-2]*nums[len-3];
        max = Math.max(nums[0]*nums[1],nums[len-2]*nums[len-3]);
        return result*max;
    }
}
