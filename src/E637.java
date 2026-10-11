import helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class E637 {

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> fifo = new LinkedList<>();
        fifo.offer(root);

        List<Double> avgList = new ArrayList<>();

        while(!fifo.isEmpty()) {
            int size = fifo.size();
            long sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode treeNode = fifo.poll();

                if (treeNode != null) {
                    sum += treeNode.val;

                    if (treeNode.left != null) fifo.offer(treeNode.left);
                    if (treeNode.right != null) fifo.offer(treeNode.right);
                }
            }

            avgList.add((double) sum / size);
        }

        return avgList;
    }

}
