package JumpGame;

public class JumpGame2 {
    public boolean canJump(int[] nums) {
        int pos = nums.length-1;
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]+i>=pos)
                pos = i;
        }
        return pos == 0;
    }
}
