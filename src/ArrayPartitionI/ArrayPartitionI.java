package ArrayPartitionI;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(new ArrayPartitionI().arrayPairSum(nums));
    }
    public int arrayPairSum(int[] nums) {
        int n = nums.length/2;
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0;i<2*n-1;i+=2)
            sum += Math.min(nums[i],nums[i+1]);
        return sum;
    }
}
