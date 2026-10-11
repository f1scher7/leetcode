import java.util.ArrayDeque;
import java.util.Deque;

public class M394 {

    static class Pair {
        String str;
        int num;

        public Pair(String str, Integer num) {
            this.str = str;
            this.num = num;
        }
    }

    public static String decodeString(String s) {
        Deque<Pair> stack = new ArrayDeque<>();
        StringBuilder digit = new StringBuilder();
        StringBuilder curr = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digit.append(ch);
            } else if (Character.isLetter(ch)) {
                curr.append(ch);
            } else if (ch == '[') {
                int num = Integer.parseInt(digit.toString());
                stack.push(new Pair(curr.toString(), num));

                digit.setLength(0);
                curr.setLength(0);
            } else if (ch == ']') {
                Pair pair = stack.pop();
                String temp = curr.toString().repeat(pair.num);
                curr = new StringBuilder(pair.str + temp);
            }
        }

        return curr.toString();
    }

}
