package RemoveElement;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2,2,3};
        int value = 2;
        System.out.println("" + new RemoveElement().removeElement(nums,value)+nums[0] + nums[1]);
    }
    public int removeElement(int[] nums, int val) {
        int temp = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[temp] = nums[i];
                temp++;
            }
        }
        return temp;
    }
}
