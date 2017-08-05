package ArrayNesting;

import java.util.ArrayList;
import java.util.List;

public class ArrayNesting {
    public static void main(String[] args) {
        int[] nums = {5,4,0,3,1,6,2};
        System.out.println(new ArrayNesting().arrayNesting(nums));
    }
    public int arrayNesting(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int k = 0;k<n;k++)
        {
            int count = 0;
            for(int i=k;nums[i]>=0;count++)
            {
                int temp = nums[i];
                nums[i] = -1;
                i = temp;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
