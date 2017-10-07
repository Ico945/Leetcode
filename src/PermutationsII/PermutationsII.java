package PermutationsII;

import Permutations.Permutations2;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new PermutationsII().permuteUnique(nums));
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temres = new ArrayList<>();
        boolean[] visit = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(result,temres,nums,visit);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temres,int[] nums,boolean[] visit){
        if(temres.size() == nums.length/*&&!result.contains(temres)*/)
            result.add(new ArrayList<>(temres));
        else {
            for(int i = 0;i<nums.length;i++){
                if(visit[i]) continue;
                if(i>0&&nums[i]==nums[i-1]&&!visit[i-1]) continue;
                visit[i] = true;
                temres.add(nums[i]);
                backtrack(result,temres,nums,visit);
                visit[i] = false;
                temres.remove(temres.size()-1);
            }
        }
    }
}
