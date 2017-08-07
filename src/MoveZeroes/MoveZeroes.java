package MoveZeroes;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1,};
        new MoveZeroes().moveZeroes(nums);
        for(int i = 0;i<nums.length;i++)
            System.out.println(nums[i]);
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n-1;j++)
            {
                if(nums[j] == 0)
                {
                    nums[j] = nums[j+1];
                    nums[j+1] = 0;
                }
            }
            n--;
        }
    }
}
