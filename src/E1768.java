public class E1768 {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();

        int wordLen1 = word1.length();
        int wordLen2 = word2.length();
        int inc = 0;

        while (wordLen1 > 0 || wordLen2 > 0) {
            if (wordLen1-- > 0) res.append(word1.charAt(inc));
            if (wordLen2-- > 0) res.append(word2.charAt(inc));

            inc++;
        }

        return res.toString();
    }

}
