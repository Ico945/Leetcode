package SumRoottoLeafNumbers;

public class SumRoottoLeafNumbers {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);TreeNode two = new TreeNode(2);TreeNode three = new TreeNode(3);TreeNode four = new TreeNode(4);TreeNode five = new TreeNode(5);TreeNode six = new TreeNode(6);
        one.left = two;one.right = three;
        two.left = four;two.right = five;
        three.left = three.right = null;
        four.left = six;four.right = null;
        five.right = five.left = null;
        six.left = six.right = null;
        System.out.println(new SumRoottoLeafNumbers().sumNumbers(one));
    }
    public int sumNumbers(TreeNode root) {
        return backtrack(root,0);
    }

    int backtrack(TreeNode root,int result){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return result*10+root.val;
        else return backtrack(root.left,result*10+root.val)+backtrack(root.right,result*10+root.val);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

