package PermutationSequence;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence2 {
    public static void main(String[] args) {
        System.out.println(new PermutationSequence2().getPermutation(3,6));
    }
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 1;i<=n;i++)
            nums.add(i);
        int[] factorial = new int[n+1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++)
            factorial[i] = i*factorial[i-1];
        StringBuilder result = new StringBuilder();
        k--;
        for(int i = n;i>0;i--){
            int ind = k/factorial[i-1];
            k = k%factorial[i-1];
            result.append(nums.get(ind));
            nums.remove(ind);
        }
        return result.toString();
    }
}
