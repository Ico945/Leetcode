package Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Permutations().permute(nums));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {

            List<Integer> temre = new ArrayList<>();
            for(int j = i;j<nums.length;j++)
            {
                swap(nums,i,j);
                for(int k = 0;k<nums.length;k++)
                    temre.add(nums[k]);
                if(!result.contains(temre))
                    result.add(temre);
            }
        }
        return result;
    }
    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
