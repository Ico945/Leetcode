package TwoSumIVInputisaBST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSumIVInputisaBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode p = root;
        root.left = new TreeNode(3);
        root = root.left;
        TreeNode three = root;
        root.left = new TreeNode(2);
        root = root.left;
        root.left = root.right = null;
        three.right = new TreeNode(4);
        three.right.left = three.right.right = null;
        p.right = new TreeNode(6);
        TreeNode six = p.right;
        six.left = null;
        six.right = new TreeNode(7);
        six.right.right = six.right.left = null;
        //System.out.println(p.val);
        System.out.println(new TwoSumIVInputisaBST().findTarget(p,9));
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        return bianli(root,list,k);
    }

    boolean bianli(TreeNode root,List<Integer> list,int k) {
        if(root == null)
            return false;
        if(list.contains(k-root.val))
            return true;
        list.add(root.val);
        return bianli(root.right,list,k)||bianli(root.left,list,k);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }