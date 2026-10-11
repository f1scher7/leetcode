public class M334 {

    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > secondMin) {
                return true;
            } else if (nums[i] > min) {
                secondMin = nums[i];
            }
        }

        return false;
    }

}
