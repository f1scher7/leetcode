import java.util.ArrayDeque;
import java.util.Deque;

public class M71 {

    public static String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] splitPath = path.split("/");
        StringBuilder res = new StringBuilder();

        for (String s : splitPath) {
            if (!s.isEmpty() && !s.equals(".") && !s.equals("..")) {
                stack.push(s);
            } else if (!stack.isEmpty() && s.equals("..")) {
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            for (String s : stack) {
                res.insert(0, "/" + stack.pop());
            }

            return res.toString();
        } else {
            return "/";
        }
    }

}
