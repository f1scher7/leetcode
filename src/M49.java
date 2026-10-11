import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> stringListHashMap = new HashMap<>();

        for (String str : strs) {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);

            String tempStringSorted = Arrays.toString(strArr);

            if (!stringListHashMap.containsKey(tempStringSorted)) {
                stringListHashMap.put(tempStringSorted, new ArrayList<>(List.of(str)));
            } else {
                stringListHashMap.get(tempStringSorted).add(str);
            }
        }

        return new ArrayList<>(stringListHashMap.values());
    }

}
