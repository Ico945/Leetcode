package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    /*public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        for (int i = 0;candidates[i]<target;i++)
        {
            if(iscontain(candidates,0,candidates.length-1,target))
                result.add(candidates[i])
        }

    }
    boolean iscontain(int[] nums,int lo,int hi,int target)
    {
        if(lo<=hi)
        {
            int mid = (lo+hi)/2;;
            if(nums[mid] == target)
                return true;
            else if(nums[mid]<target)
                return iscontain(nums,mid+1,hi,target);
            else return iscontain(nums,lo,mid-1,target);
        }
        else return false;
    }*/
}
