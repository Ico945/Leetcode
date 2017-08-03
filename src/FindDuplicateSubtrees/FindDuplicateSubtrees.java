package FindDuplicateSubtrees;


import java.util.List;
import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class FindDuplicateSubtrees {
    public boolean Issame(TreeNode root1,TreeNode root2){
        TreeNode temp;
        Stack<TreeNode> p1 = new Stack<TreeNode>();
        Stack<TreeNode> p2 = new Stack<TreeNode>();
        for(int i = 0;root1.left != null;i++)
        {
            p1.push(root1);
            temp = root1;
            root1 = root1.left;
        }
        p1.pop();
        return true;
    }
}
