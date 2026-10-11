import java.util.HashSet;
import java.util.Set;

public class M128 {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        int longest = 0;
        
        for (int n : nums) {
            integerSet.add(n);
        }

        for (int n : integerSet) {
            if (!integerSet.contains(n - 1)) {
                int currNum = n;
                int currStreak = 1;

                while (integerSet.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                longest = Math.max(longest, currStreak);
            }
        }

        return longest;
    }

}
