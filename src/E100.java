import helpers.TreeNode;

public class E100 {

    public boolean isTheSameTree(TreeNode p, TreeNode l) {
        if (p == null && l == null) return true;
        if (p == null || l == null) return false;
        if (p.val != l.val) return false;

        return isTheSameTree(p.left, l.left) && isTheSameTree(p.right, l.left);
     }

}
