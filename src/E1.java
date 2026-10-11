import java.util.Arrays;

public class E1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] numsClone = nums.clone();
        Arrays.sort(numsClone);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = numsClone[left] + numsClone[right];

            if (sum == target) {
                int idx1 = -1;
                int idx2 = -1;

                for (int i = 0; i < nums.length; i++) {
                    if (idx1 == - 1 && numsClone[left] == nums[i]) {
                        idx1 = i;
                    } else if (idx2 == - 1 && numsClone[right] == nums[i]) {
                        idx2 = i;
                    }

                    if (idx1 != -1 && idx2 != -1) {
                        return new int[]{idx1, idx2};
                    }
                }

                return new int[]{idx1, idx2};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

}
