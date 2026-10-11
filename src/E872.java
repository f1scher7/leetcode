import helpers.TreeNode;

import java.util.*;

public class E872 {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Deque<TreeNode> lifo1 = new ArrayDeque<>();
        Deque<TreeNode> lifo2 = new ArrayDeque<>();

        List<Integer> leafs1 = new ArrayList<>();
        List<Integer> leafs2 = new ArrayList<>();

        lifo1.push(root1);
        lifo2.push(root2);

        while(!lifo1.isEmpty() || !lifo2.isEmpty()) {
            processTree(lifo1, leafs1);
            processTree(lifo2, leafs2);
        }

        if (leafs1.size() != leafs2.size()) {
            return false;
        }

        for (int i = 0; i < leafs1.size(); i++) {
            if (leafs1.get(i).equals(leafs2.get(i))) {
                return false;
            }
        }

        return true;
    }

    private static void processTree(Deque<TreeNode> lifo, List<Integer> leafs) {
        if (!lifo.isEmpty()) {
            TreeNode node = lifo.pop();

            if (node.left == null && node.right == null) {
                leafs.add(node.val);
            } else {
                if (node.left != null) {
                    lifo.push(node.left);
                }

                if (node.right != null) {
                    lifo.push(node.right);
                }
            }
        }
    }

}
