import java.util.*;

public class M347 {

    public static int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int resIdx = 0;

        Map<Integer, Integer> freqMap = new HashMap<>();
        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        while (!minHeap.isEmpty()) {
            res[resIdx++] = minHeap.poll().getKey();
        }

        return res;
    }

}
