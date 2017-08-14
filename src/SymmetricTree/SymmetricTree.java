package SymmetricTree;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode a = null;
        TreeNode b = null;
        System.out.print(a == b);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return IsSymTre(root.left,root.right);
    }
    public boolean IsSymTre(TreeNode left,TreeNode right){
        if(left == null&&right == null)
            return true;
        if(left == null||right == null)
            return false;
        return (left.val == right.val)&&IsSymTre(left.left,right.right)&&IsSymTre(left.right,right.left);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }