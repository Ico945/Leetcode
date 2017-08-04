package FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums = {27,40,6,21,14,36,10,19,44,10,41,26,39,20,25,19,14,7,29,27,40,38,11,44,4,6,48,39,9,13,7,45,41,23,31,8,24,1,3,5,28,11,49,29,18,4,38,32,24,15};
        System.out.println(new FindAllNumbersDisappearedinanArray().findDisappearedNumbers(nums));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0,k = 1;k<=n;i++,k++) {
            if(i==n)
                i--;
            if (nums[i] != k) {
                if (k >= nums[i]&&i < n-1) {
                        k--;
                } else {
                    res.add(k);
                    i--;
                }
            }
        }
        return res;
    }
}
