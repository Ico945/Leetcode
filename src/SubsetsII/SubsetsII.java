package SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(new SubsetsII().subsetsWithDup(nums));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }
    void backtrack(List<List<Integer>>result,List<Integer>temres,int[] nums,int start){
        result.add(new ArrayList<>(temres));
        for(int i = start;i<nums.length;i++){
            if(i!=start&&nums[i]==nums[i-1])
                continue;
            temres.add(nums[i]);
            backtrack(result,temres,nums,i+1);
            temres.remove(temres.size()-1);
        }
    }
}
