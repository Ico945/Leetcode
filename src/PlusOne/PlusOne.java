package PlusOne;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {9};
        int[] result = new PlusOne().plusOne(nums);
        for(int i = 0;i<result.length;i++)
            System.out.print(result[i]);
    }
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        List<Integer> result = new ArrayList<>();
        int count = 1;
        for(int i = len-1;i>=0;i--)
        {
            result.add((digits[i]+count)%10);
            count = (digits[i]+count)/10;
        }
        if (count == 1)
            result.add(1);
        int[] re = new int[result.size()];
        for(int i = 0;i<re.length;i++)
        {
            re[i] = result.get(re.length-i-1);
        }
        return re;
    }
}
