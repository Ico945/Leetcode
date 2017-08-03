package SearchinRotatedSortedArray;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        System.out.println(new SearchinRotatedSortedArray().search(nums,target));
    }
    public int search(int[] nums, int target) {
        int length = nums.length;
        int lo = 0;
        int hi = length-1;
        while(lo<=hi)
        {
            int mid = (lo+hi)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[lo] <= nums[mid])
            {
                if(target < nums[mid] && target >= nums[lo])
                    hi = mid - 1;
                else
                    lo = mid +1 ;
            }
            if(nums[mid] <= nums[hi])
            {
                if(target > nums[mid] && target <= nums[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
        /*for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == target)
                return i;
        }
        return -1;*/
    }
}
