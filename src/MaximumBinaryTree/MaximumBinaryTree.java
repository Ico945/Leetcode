package MaximumBinaryTree;

public class MaximumBinaryTree {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        System.out.println(new MaximumBinaryTree().constructMaximumBinaryTree(nums));
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        return set(nums,left,right);
    }
    public TreeNode set(int[] nums,int left,int right){
        if(left>right)
            return null;
        int max_index = left;
        for(int i=left;i<=right;i++){
            if(nums[max_index]<nums[i]){
                max_index = i;
            }
        }
        TreeNode root = new TreeNode(nums[max_index]);
        root.left = set(nums,left,max_index-1);
        root.right = set(nums,max_index+1,right);
        return root;
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }