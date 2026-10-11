import java.util.*;

public class E205 {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sHashMap = new HashMap<>();
        HashMap<Character, Integer> tHashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!sHashMap.containsKey(s.charAt(i))) {
                sHashMap.put(s.charAt(i), i);
            }

            if (!tHashMap.containsKey(t.charAt(i))) {
                tHashMap.put(s.charAt(i), i);
            }

            if (!sHashMap.get(s.charAt(i)).equals(tHashMap.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

}
