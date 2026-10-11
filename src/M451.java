import java.util.*;

public class M451 {

    public static String frequencySort(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> freqMap = new HashMap<>();
        Queue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            maxHeap.offer(entry);
        }

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            stringBuilder.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return stringBuilder.toString();
    }

}
