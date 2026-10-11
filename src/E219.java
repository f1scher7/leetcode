import java.util.HashMap;

public class E219 {

    public boolean containsNearbyDuplicates(int[] nums, int k) {
        HashMap<Integer, Integer> indicesHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!indicesHashMap.containsKey(nums[i])) {
                indicesHashMap.put(nums[i], i);
            } else {
                if (Math.abs(indicesHashMap.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    indicesHashMap.put(nums[i], i);
                }
            }
        }

        return false;
    }

}
