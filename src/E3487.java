import java.util.Comparator;
import java.util.TreeSet;

public class E3487 {

    public int maxSum(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        int sum = 0;

        for (int n : nums) {
            treeSet.add(n);
        }

        int firstEl = treeSet.first();

        if (firstEl < 0) {
            return firstEl;
        } else if (firstEl == 0) {
            return 0;
        }

        for (Integer n : treeSet) {
            if (n > 0) {
                sum += n;
            } else {
                return sum;
            }
        }

        return sum;
    }
}
