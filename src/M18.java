import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resList = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int el1 = nums[i];

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int el2 = nums[j];
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) el1 + el2 + nums[left] + nums[right];

                    if (sum == target) {
                        resList.add(List.of(el1, el2, nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return resList;
    }

}
