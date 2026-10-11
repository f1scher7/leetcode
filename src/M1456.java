import java.util.Set;

public class M1456 {
    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < k; i++) {
            if (isVowel(arr[i])) {
                maxVowels++;
            }
        }

        int currVowels = maxVowels;

        for (int i = k; i < arr.length; i++) {
            if (isVowel(arr[i - k])) {
                currVowels--;
            }

            if (isVowel(arr[i])) {
                currVowels++;
            }

            maxVowels = Math.max(maxVowels, currVowels);

            if (maxVowels == k) {
                return maxVowels;
            }
        }

        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
