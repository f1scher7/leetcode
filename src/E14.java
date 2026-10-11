public class E14 {

    public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        String minStr = "";
        int minStrLen = Integer.MAX_VALUE;
        boolean flag = false;

        for (String str : strs) {
            if (minStrLen > str.length()) {
                minStrLen = str.length();
                minStr = str;
            }
        }

        for (int i = 0; i < minStr.length(); i++) {
            String substring = minStr.substring(0, i + 1);

            for (String str : strs) {
                if (!str.equals(substring)) {
                    if (!str.startsWith(substring)) {
                        flag = true;
                        break;
                    }
                }
            }

            if (!flag) {
                if (longestPrefix.length() < substring.length()) {
                    longestPrefix = substring;
                }
            }

            flag = false;
        }

        return longestPrefix;
    }

}
