package SameTree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null&&q == null)
            return true;
        else if (p != null&&q != null)
            return (q.val == p.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        return false;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }