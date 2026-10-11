import java.util.ArrayDeque;
import java.util.Deque;

public class E933 {
    private final Deque<Integer> stack;

    public E933() {
        this.stack = new ArrayDeque<>();
    }

    public int ping(int t) {
        int lowerBound = t - 3000;

        stack.addLast(t);

        while(!stack.isEmpty() && stack.peek() < lowerBound) {
            stack.pop();
        }

        return stack.size();
    }

}
