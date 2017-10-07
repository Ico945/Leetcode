package JumpGame;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(new JumpGame().canJump(nums));
    }
    public boolean canJump(int[] nums) {
        int max = 0,i;
        for(i = 0;i<nums.length&&i<=max;i++){
            max = Math.max(max,nums[i]+i);
        }
        return i>nums.length-1;
    }
}
