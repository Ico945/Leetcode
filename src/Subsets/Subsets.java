package Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Subsets().subsets(nums));
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }
    void backtrack(List<List<Integer>> result,List<Integer> temres,int[] nums,int i){
        result.add(new ArrayList<>(temres));
        while (i<nums.length){
            temres.add(nums[i]);
            backtrack(result,temres,nums,++i);
            temres.remove(temres.size()-1);
        }
    }
}
