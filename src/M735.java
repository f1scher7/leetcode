import java.util.Stack;

public class M735 {

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        if (asteroids.length < 2) {
            return asteroids;
        }

        stack.push(asteroids[0]);

        for (int i = 1; i < asteroids.length; i++) {
            if (!stack.isEmpty()) {
                int firstInStack = stack.peek();

                if ((asteroids[i] < 0 && firstInStack < 0) || (asteroids[i] > 0 && firstInStack > 0) || (asteroids[i] > 0 && firstInStack < 0)) {
                    stack.push(asteroids[i]);
                } else {
                    if (Math.abs(asteroids[i]) > Math.abs(firstInStack)) {
                        stack.pop();
                        boolean astFromListToPush = true;

                        while (true) {
                            if (!stack.isEmpty()) {
                                firstInStack = stack.pop();

                                if (asteroids[i] == firstInStack) {
                                    stack.push(firstInStack);
                                    break;
                                } else if ((asteroids[i] < 0 && firstInStack < 0) || (asteroids[i] > 0 && firstInStack > 0)) {
                                    stack.push(firstInStack);
                                    break;
                                } else if (Math.abs(asteroids[i]) == Math.abs(firstInStack)) {
                                    if (asteroids[i] > firstInStack) {
                                        stack.push(firstInStack);
                                    } else {
                                        astFromListToPush = false;
                                    }

                                    break;
                                } else if (Math.abs(asteroids[i]) < Math.abs(firstInStack)) {
                                    stack.push(firstInStack);
                                    astFromListToPush = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }

                        if (astFromListToPush) {
                            stack.push(asteroids[i]);
                        }
                    } else if (Math.abs(asteroids[i]) == Math.abs(firstInStack)) {
                        stack.pop();
                    }
                }
            } else {
                stack.push(asteroids[i]);
            }
        }

        int resSize = stack.size();
        int[] res = new int[resSize];

        for (int i = resSize - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }

}
