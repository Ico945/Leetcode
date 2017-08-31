package MergeSortedArray;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,0,0};
        int[] nums2 = {2,5};
        new MergeSortedArray().merge(nums1,3,nums2,2);
        for(int i = 0;i<5;i++)
            System.out.println(nums1[i]);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j = n-1,k = n+m-1;
        while (i>=0&&j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        if(i<0)
        {
            while (j>=0)
            {
                nums1[j] = nums2[j];
                j--;
            }
        }
    }
}
