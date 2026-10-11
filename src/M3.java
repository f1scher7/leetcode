import java.util.HashSet;
import java.util.Set;


public class M3 {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (left <= right || right < s.length() - 1) {
            String substring = s.substring(left, right + 1);

            if (M3.isSubstringHasUniqueChars(substring)) {
                if (maxLen < substring.length()) {
                    maxLen = substring.length();
                }

                right++;
            } else {
                left++;
            }
        }

        return maxLen;
    }

    private static boolean isSubstringHasUniqueChars(String s) {
        Set<Character> characterSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!characterSet.add(c)) {
                return false;
            }
        }

        return true;
    }

}
