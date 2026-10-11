import java.util.HashMap;

public class E383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int temp = freqMap.getOrDefault(c, -1);

            if (temp == -1 || temp == 0) {
                return false;
            } else {
                freqMap.put(c, freqMap.get(c) - 1);
            }
        }

        return true;
    }

}
