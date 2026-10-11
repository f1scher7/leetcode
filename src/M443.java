import java.util.HashMap;
import java.util.Map;

public class M443 {

    public static int compress(char[] chars) {
        Map<Character, Integer> freqMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        int res = 0;

        for (char aChar : chars) {
            freqMap.put(aChar, freqMap.getOrDefault(aChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                stringBuilder.append(entry.getKey());
                res++;
            } else {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(entry.getValue());
                res += entry.getValue() + 1;
            }
        }

        chars = stringBuilder.toString().toCharArray();

        return res;
    }

}
