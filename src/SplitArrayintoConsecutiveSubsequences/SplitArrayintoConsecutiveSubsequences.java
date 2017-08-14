package SplitArrayintoConsecutiveSubsequences;

import java.util.ArrayList;
import java.util.List;

public class SplitArrayintoConsecutiveSubsequences {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5};
        System.out.print(new SplitArrayintoConsecutiveSubsequences().isPossible(nums));
    }
    public boolean isPossible(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
            temp.add(nums[i]);
        while(temp.size() != 0)
        {
            int count;
            for(int i = 0;i<temp.size()-1;i++)
            {
                int k = i;
                int j = k+1;
                count = 0;
                while (j<temp.size()-1)
                {
                    if (temp.get(k) == temp.get(j)-1)
                    {
                        temp.remove(k);
                        count++;
                        if(k != j-1)
                        {
                            k=j;
                            j++;
                        }
                    }
                    else j++;
                }
            }
        }
        return true;
    }
}
