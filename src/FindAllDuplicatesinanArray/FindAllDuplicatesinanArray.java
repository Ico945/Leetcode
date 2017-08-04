package FindAllDuplicatesinanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(new FindAllDuplicatesinanArray().findDuplicates(nums));
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if(n<2)
            return res;
        if(n == 2&&nums[0]==nums[1])
        {
            res.add(nums[0]);
            return res;
        }
        for(int i = 0;i<n-2;i++)
        {
            if(nums[i] == nums[i+1]&&nums[i] != nums[i+2])
            {
                res.add(nums[i]);
                i++;
            }else if (nums[i] == nums[i+1]&&nums[i] == nums[i+2])
            {
                while(nums[i] == nums[i+1])
                    i++;
            }
        }
        if(nums[n-2]==nums[n-1])
            res.add(nums[n-1]);
        return res;
    }
}
