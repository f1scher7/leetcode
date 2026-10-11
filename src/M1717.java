public class M1717 {

    public static int maximumGain(String s, int x, int y) {
        char firstChar = x >= y ? 'a' : 'b';
        char secondChar = firstChar == 'a' ? 'b' : 'a';

        int high = Math.max(x, y);
        int low = Math.min(y, x);

        int res = 0;

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c);
            int sbLen = sb.length();

            if (sbLen >= 2 && sb.charAt(sbLen - 2) == firstChar && c == secondChar) {
                res += high;
                sb.delete(sbLen - 2, sbLen);
            }
        }

        StringBuilder finalSb = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            finalSb.append(c);
            int sbLen = finalSb.length();

            if (sbLen >= 2 && finalSb.charAt(sbLen - 2) == secondChar && c == firstChar) {
                res += low;
                finalSb.delete(sbLen - 2, sbLen);
            }
        }

        return res;
    }

}
