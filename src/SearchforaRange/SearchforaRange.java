package SearchforaRange;

public class SearchforaRange {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(new SearchforaRange().searchRange(nums,8)[0]);
        System.out.println(new SearchforaRange().searchRange(nums,8)[1]);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        int lo = Integer.MAX_VALUE,hi = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target) {
                lo = Math.min(lo,i);
                hi = Math.max(hi,i);
            }
        }
        if(hi != -1){
            result[0] = lo;
            result[1] = hi;
        }
        return result;
    }
}
