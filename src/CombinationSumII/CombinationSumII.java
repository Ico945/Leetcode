package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        System.out.println(new CombinationSumII().combinationSum2(nums,8));
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temres,int[] nums,int target,int i){
        if(target<0)return;
        if(target == 0&&!result.contains(temres))
            result.add(new ArrayList<>(temres));
        else {
            for(;i<nums.length;){
                temres.add(nums[i]);
                backtrack(result,temres,nums,target-nums[i],++i);
                temres.remove(temres.size()-1);
            }
        }
    }
}
