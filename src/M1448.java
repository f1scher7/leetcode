import helpers.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class M1448 {

    static class Pair {
        TreeNode node;
        int num;

        public Pair(TreeNode node, Integer num) {
            this.node = node;
            this.num = num;
        }
    }

    public static int goodNodes(TreeNode root) {
        if (root == null) return 0;

        int res = 1;
        Deque<Pair> lifo = new ArrayDeque<>();

        lifo.push(new Pair(root, root.val));

        while(!lifo.isEmpty()) {
            Pair pair = lifo.pop();
            TreeNode node = pair.node;
            int maxNumSoFar = pair.num;

            if (node.left != null) {
                if (maxNumSoFar <= node.left.val) {
                    lifo.push(new Pair(node.left, node.left.val));
                    res++;
                } else {
                    lifo.push(new Pair(node.left, maxNumSoFar));
                }

            }

            if (node.right != null) {
                if (maxNumSoFar <= node.right.val) {
                    lifo.push(new Pair(node.right, node.right.val));
                    res++;
                } else {
                    lifo.push(new Pair(node.right, maxNumSoFar));
                }
            }
        }

        return res;
    }

}
