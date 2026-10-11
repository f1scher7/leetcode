import java.util.*;

public class M1657 {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            freqMap1.put(word1.charAt(i), freqMap1.getOrDefault(word1.charAt(i), 0) + 1);
            freqMap2.put(word2.charAt(i), freqMap2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (!freqMap1.keySet().equals(freqMap2.keySet())) {
            return false;
        } else {
            List<Integer> list1 = new ArrayList<>(freqMap1.values());
            List<Integer> list2 = new ArrayList<>(freqMap2.values());

            Collections.sort(list1);
            Collections.sort(list2);

            return list1.equals(list2);
        }
    }

}
