public class E724 {

    public static int pivotIndex(int[] nums) {
        int numsLen = nums.length;
        int[] sumLeftArr = new int[numsLen];
        int[] sumRightArr = new int[numsLen];
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < numsLen; i++) {
            sumLeft += nums[i];
            sumLeftArr[i] = sumLeft;
        }

        for (int i = numsLen - 1; i >= 0; i--) {
            sumRight += nums[i];
            sumRightArr[i] = sumRight;
        }

        for (int i = 0; i < numsLen; i++) {
            if (sumLeftArr[i] == sumRightArr[i]) {
                return i;
            }
        }

        return -1;
    }

}
