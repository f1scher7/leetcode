public class M34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};

        if (nums.length == 0) return res;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) res[0] = mid;
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) res[1] = mid;
        }

        return res;
    }

}
