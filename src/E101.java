import helpers.TreeNode;

import java.util.LinkedList;

public class E101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left == null || root.right == null) return false;

        LinkedList<TreeNode> leftStack = new LinkedList<>();
        LinkedList<TreeNode> rightStack = new LinkedList<>();

        TreeNode rootLeft = root.left;
        TreeNode rootRight = root.right;

        leftStack.push(rootLeft);
        rightStack.push(rootRight);

        while (!leftStack.isEmpty() && !rightStack.isEmpty()) {
            TreeNode nodeFromLeft = leftStack.pop();
            TreeNode nodeFromRight = rightStack.pop();

            if (nodeFromLeft == null && nodeFromRight == null) continue;
            if (nodeFromLeft == null || nodeFromRight == null) return false;
            if (nodeFromLeft.val != nodeFromRight.val) return false;


            leftStack.push(nodeFromLeft.left);
            leftStack.push(nodeFromLeft.right);
            rightStack.push(nodeFromRight.right);
            rightStack.push(nodeFromRight.left);
        }

        return leftStack.isEmpty() && rightStack.isEmpty();
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

}
