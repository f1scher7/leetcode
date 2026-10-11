import helpers.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class E104 {

    static class Pair {

        TreeNode node;
        int n;

        public Pair(TreeNode node, int n) {
            this.node = node;
            this.n = n;
        }

    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Deque<Pair> lifo = new ArrayDeque<>();
        int maxDepth = 0;

        lifo.push(new Pair(root, 1));

        while(!lifo.isEmpty()) {
            Pair pair = lifo.pop();
            int depth = pair.n;

            maxDepth = Math.max(maxDepth, depth);

            if (pair.node.left != null) {
                lifo.push(new Pair(pair.node.left, depth + 1));
            }


            if (pair.node.right != null) {
                lifo.push(new Pair(pair.node.right, depth + 1));
            }
        }

        return maxDepth;
    }

}
