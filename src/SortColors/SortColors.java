package SortColors;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {0,2,1,0,0,2,1,2,2,1,1};
        new SortColors().sortColors(nums);
        for(int i = 0;i<nums.length;i++)
            System.out.println(nums[i]);
    }
    public void sortColors(int[] nums) {
        for(int i = 0;i<nums.length-1;i++)
        {
            for(int j = 0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                    swap(nums,j);
            }
        }
    }
    public void swap(int[] nums,int i)
    {
        int temp = nums[i];
        nums[i] = nums[i+1];
        nums[i+1] = temp;
    }

}
