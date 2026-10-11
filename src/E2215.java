import java.util.*;
import java.util.stream.Collectors;

public class E2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> left = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> right = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        Set<Integer> leftRes = new HashSet<>(left);
        leftRes.removeAll(right);

        Set<Integer> rightRes = new HashSet<>(right);
        rightRes.removeAll(left);

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(leftRes));
        res.add(new ArrayList<>(rightRes));

        return res;
    }

}
