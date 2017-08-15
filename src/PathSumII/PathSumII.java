package PathSumII;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(5);
        TreeNode two = new TreeNode(4);
        TreeNode three = new TreeNode(8);
        TreeNode four = new TreeNode(11);
        TreeNode five = new TreeNode(13);
        TreeNode six = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(2);
        TreeNode nine = new TreeNode(5);
        TreeNode ten = new TreeNode(1);
        one.left = two;one.right = three;
        two.left = four;
        three.left = five;three.right = six;
        four.left = seven;four.right = eight;
        six.left = nine;six.right = ten;
        int sum = 22;
        System.out.println(new PathSumII().pathSum(one,sum));
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sonres = new ArrayList<>();
        pathSum(root,sum,sonres,result);
        return result;
    }
    public void pathSum(TreeNode root,int sum,List<Integer> sonres,List<List<Integer>> result){
        if(root == null)
            return;
        sonres.add(root.val);
        if(root.left == null&&root.right == null&&root.val == sum)
        {
            result.add(new ArrayList<>(sonres));
            sonres.remove(sonres.size()-1);
            return;
        }
        else {
            sum -= root.val;
            pathSum(root.left,sum,sonres,result);
            pathSum(root.right,sum,sonres,result);
        }
        sonres.remove(sonres.size()-1);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
