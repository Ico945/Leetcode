package SearchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(new SearchInsertPosition().searchInsert(nums,target));
    }
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int mid = 0;
        while (lo<hi)
        {
            mid = (lo+hi)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                lo = mid+1;
            else
                hi = mid - 1;
        }
        if(nums[lo]<target)
            return lo+1;
        else return lo;
    }
}
