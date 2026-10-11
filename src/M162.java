public class M162 {

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return 0;

        int left = 0;
        int right = nums.length > 2 ? 2 : 1;

        while (right < nums.length) {
            int middle = right - 1;

            if (nums[middle] > nums[left] && nums[middle] > nums[right]) {
                return middle;
            } else {
                left++;
                right++;
            }
        }

        return -1;
    }

}
