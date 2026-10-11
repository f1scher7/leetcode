import java.util.ArrayDeque;
import java.util.Deque;

// MinStack
public class M155 {

    private final Deque<Integer> stack;
    private final Deque<Integer> stackMin;

    public M155() {
        this.stack = new ArrayDeque<>();
        this.stackMin = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (stackMin.isEmpty() || val <= stackMin.peek()) {
            stackMin.push(val);
        } else {
            stackMin.push(stackMin.peek());
        }
    }

    public void pop() {
        stack.pop();
        stackMin.pop();
    }

    public int top() {
        if (!this.stack.isEmpty()) {
            return this.stack.peek();
        }

        return Integer.MIN_VALUE;
    }

    public int getMin() {
        if (!this.stackMin.isEmpty()) {
            return this.stackMin.peek();
        }

        return Integer.MIN_VALUE;
    }

}
