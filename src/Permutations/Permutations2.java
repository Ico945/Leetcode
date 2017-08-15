package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new Permutations2().permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temlist = new ArrayList<>();
        backtrack(result,temlist,nums);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temlist,int[] nums){
        if(temlist.size() == nums.length)
            result.add(new ArrayList<>(temlist));
        else {
            for(int i = 0;i<nums.length;i++)
            {
                if(!temlist.contains(nums[i])){
                    temlist.add(nums[i]);
                    backtrack(result,temlist,nums);
                    temlist.remove(temlist.size()-1);
                }
            }
        }
    }
}
