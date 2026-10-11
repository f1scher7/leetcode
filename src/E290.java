import java.util.HashMap;

public class E290 {

    public static boolean wordPattern(String pattern, String s) {
        String[] sArr = s.split(" ");

        HashMap<Character, Integer> patternHashMap = new HashMap<>();
        HashMap<String, Integer> sHashMap = new HashMap<>();

        if (pattern.length() != sArr.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (!patternHashMap.containsKey(pattern.charAt(i))) {
                patternHashMap.put(pattern.charAt(i), i);
            }

            if (!sHashMap.containsKey(sArr[i])) {
                sHashMap.put(sArr[i], i);
            }

            if (!patternHashMap.get(pattern.charAt(i)).equals(sHashMap.get(sArr[i]))) {
                return false;
            }
        }

        return true;
   }

}
