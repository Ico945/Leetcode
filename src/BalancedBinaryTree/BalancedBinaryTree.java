package BalancedBinaryTree;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        TreeNode p = root;
        if (p == null)
            return true;
        if(Math.abs(deep(p.left)-deep(p.right))>1)
            return false;
        else
            return isBalanced(p.left)&&isBalanced(p.right);
    }
    public int deep(TreeNode t)
    {
        if(t == null)
            return 0;
        else return Math.max(deep(t.left),deep(t.right))+1;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }