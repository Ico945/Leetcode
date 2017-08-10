import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        int[] nums1 = {4,7,5,2};
        int[] nums2 = {3,8};
        System.out.println(new Hello().midnum(nums1,nums2));

    }
    public double midnum(int[] nums1,int[] nums2) {
        double result;
        int len1 = nums1.length, l1 = 0, l2 = 0;
        int len2 = nums2.length;
        int[] nums = new int[len1 + len2];
        int i = 0;
        while (l1 < len1 && l2 < len2)
        {
            if(nums1[l1]<nums2[l2])
            {
                nums[i] = nums[l1];
                l1++;
            }
            else {
                nums[i] = nums[l2];
                l2++;
            }
            i++;
        }
        if(l1 == len1)
            for(;i<len1+len2;i++,l2++)
                nums[i] = nums2[l2];
        else
            for(;i<len1+len2;i++,l1++)
                nums[i] = nums1[l1];
        int len = nums.length;
        if(len%2 == 0)
            result = (nums[len/2]+nums[len/2-1])/2.0;
        else result = nums[len/2];
        return result;
    }
}
