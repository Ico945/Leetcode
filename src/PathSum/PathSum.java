package PathSum;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        root.val = sum - root.val;
        if(root.val == 0&&root.left == null&&root.right == null)
            return true;
        else
            return hasPathSum(root.left,root.val) || hasPathSum(root.right,root.val);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
