package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(3);
        TreeNode a2 = new TreeNode(9);
        TreeNode a3 = new TreeNode(20);
        TreeNode a4 = null;
        TreeNode a5 = null;
        TreeNode a6 = new TreeNode(15);
        TreeNode a7 = new TreeNode(7);
        a1.left = a2;a1.right = a3;
        a2.left = a4;a2.right = a5;
        a3.left = a6;a3.right = a7;
        System.out.print(new BinaryTreeLevelOrderTraversal().levelOrder(a1));
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> tem = new ArrayList<>();
        queue.offer(root);
        while (queue.size()!=0)
        {
            int len = queue.size();
            for(int i = 0;i<len;i++)
            {
                TreeNode t = queue.poll();
                if(t != null)
                {
                    tem.add(t.val);
                    if(t.left != null)
                        queue.offer(t.left);
                    if(t.right != null)
                        queue.offer(t.right);
                }
            }
            result.add(tem);
            tem = new ArrayList<>();
        }
        return result;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }