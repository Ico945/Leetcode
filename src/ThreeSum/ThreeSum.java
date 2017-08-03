package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(new ThreeSum().threeSum(nums));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Integer sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            sum += nums[i];
            for(int j = i+1;j<nums.length;j++)
            {
                sum += nums[j];
                for(int k = j+1;k<nums.length;k++)
                {
                    sum += nums[k];
                    if(sum == 0)
                    {
                        if(!result.contains(Arrays.asList(nums[i],nums[j],nums[k])))
                            result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        sum = 0;
                    }
                    sum -= nums[k];
                }
                sum -= nums[j];
            }
            sum -= nums[i];
        }return result;
    }
}
