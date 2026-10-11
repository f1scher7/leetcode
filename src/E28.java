public class E28 {

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;
        if (haystack.equals(needle)) return 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() <= haystack.length()) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }

        return -1;
    }

}
