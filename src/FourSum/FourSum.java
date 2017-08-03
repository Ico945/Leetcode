package FourSum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0};
        int target = 0;
        System.out.println(new FourSum().fourSum(nums,target));
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ;i<nums.length;i++)
        {
            if(i == 0|| nums[i] != nums[i-1])
            {
                for(int j = i+1;j<nums.length - 2;j++)
                {
                    if(j == i+1 || nums[j] != nums[j-1])
                    {
                        int lo = j+1,hi = nums.length - 1;
                        while(lo<hi)
                        {
                            if(nums[lo] + nums[hi] + nums[i] + nums[j] == target)
                            {
                                result.add(Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]));
                                while(lo<hi && nums[lo] == nums[lo+1])
                                    lo++;
                                while(lo<hi && nums[hi] == nums[hi-1])
                                    hi--;
                                lo++;hi--;
                            }
                            else if(nums[lo] + nums[hi] + nums[i] + nums[j] < target)
                                lo++;
                            else
                                hi--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
