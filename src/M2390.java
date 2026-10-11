import java.util.ArrayDeque;
import java.util.Deque;

public class M2390 {

    public static String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.poll();
            } else {
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }

}
