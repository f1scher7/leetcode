import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class E1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        IntStream.range(0, arr.length).forEach(i -> freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1));

        Set<Integer> freqSet = new HashSet<>(freqMap.values());

        return freqSet.size() == freqMap.size();
    }

}
