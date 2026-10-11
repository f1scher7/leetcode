import java.util.*;

public class M380 {

    private final List<Integer> nums;
    private final Map<Integer, Integer> numsIdxes;
    private final Random random;


    public M380() {
        nums = new ArrayList<>();
        numsIdxes = new HashMap<>();
        random = new Random();
    }


    public boolean insert(int val) {
        if (!numsIdxes.containsKey(val)) {
            numsIdxes.put(val, nums.size());
            nums.add(val);

            return true;
        }

        return false;
    }


    public boolean remove(int val) {
        if (!numsIdxes.containsKey(val)) {
            return false;
        } else {
            int index = numsIdxes.get(val);
            int lastVal = nums.get(nums.size() - 1);

            nums.set(index, lastVal);
            nums.remove(nums.size() - 1);
            numsIdxes.put(lastVal, index);
            numsIdxes.remove(val);

            return true;
        }
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }

    public List<Integer> getNums() {
        System.out.println();
        return nums;
    }

    public Map<Integer, Integer> getNumsIdxes() {
        return numsIdxes;
    }

}
