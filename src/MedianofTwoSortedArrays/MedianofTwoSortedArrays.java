/*
package MedianofTwoSortedArrays;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int lo1 = 0,lo2 = 0,count = 0;
        while (lo1<len1&&lo2<len2&&count<(len1+len2)/2){
            if(nums1[lo1]<nums2[lo2])
                lo1++;
            else lo2++;
            count++;
        }
        while (count<(len1+len2)/2){
            if(lo1==len1)
                lo2++;
            else lo1++;
            count++;
        }
        if((len1+len2)%2!=0)
            return Math.min(nums1[lo1],nums2[lo2]);
        else if(nums1[lo1]>)
    }
}
*/
