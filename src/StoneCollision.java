import java.util.*;

public class StoneCollision {

    public static List<Integer> collide(List<Integer> collide) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < collide.size(); i++) {
            int curr = collide.get(i);
            int dir = i % 2 == 0 ? 1 : -1;

            if (dir == 1) {
                stack.push(curr);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int top = stack.peek();

                    if (top == curr) {
                        curr = 0;
                        stack.pop();
                    } else if (top > curr) {
                        curr = 0;
                        break;
                    } else {
                        stack.pop();
                    }
                }

                if (curr != 0) {
                    stack.push(-curr);
                }
            }
        }

        List<Integer> res = new ArrayList<>(stack);
        Collections.reverse(res);

        return res;
    }

}
