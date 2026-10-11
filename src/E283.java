import java.util.Arrays;
import java.util.List;

public class E283 {

    public void moveZeros(int[] nums) {
        List<Integer> numsWithoutZeros = Arrays.stream(nums)
                .filter(n -> n != 0)
                .boxed()
                .toList();

        for (int i = 0; i < nums.length; i++) {
            if (i < numsWithoutZeros.size()) {
                nums[i] = numsWithoutZeros.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }

}
