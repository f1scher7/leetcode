import java.util.*;

public class M966 {

    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] res = new String[queries.length];

        Set<String> wordlistSet = new HashSet<>(Arrays.asList(wordlist));
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelInsensitive = new HashMap<>();

        for (String word : wordlist) {
            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);
            vowelInsensitive.putIfAbsent(devowel(lower), word);
        }

        for (int i = 0; i < queries.length; i++) {
            String queryLower = queries[i].toLowerCase();

            if (wordlistSet.contains(queries[i])) {
                res[i] = queries[i];
            } else if (caseInsensitive.containsKey(queryLower)) {
                res[i] = caseInsensitive.get(queryLower);
            } else res[i] = vowelInsensitive.getOrDefault(devowel(queryLower), "");
        }

        return res;
    }

    private String devowel(String s) {
        return s.replaceAll("[aeiuo]", "*");
    }

}
