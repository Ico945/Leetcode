package ThreeSumclos;

import java.util.Arrays;

public class ThreeSumclos {
    public static void main(String[] args) {
        int[] nums = {0,2,1,-3};
        int target = 1;
        System.out.println(new ThreeSumclos().threeSumClosest(nums,target));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<nums.length - 2;i++)
        {
            int lo = i+1,hi = nums.length-1;
            while(lo<hi)
            {
                int sum = nums[i]+nums[lo]+nums[hi];
                if(Math.abs(target-sum)<Math.abs(target-result))
                    result = sum;
                if(sum<target)
                    lo++;
                else hi--;
            }
        }
        return result;
    }
}
