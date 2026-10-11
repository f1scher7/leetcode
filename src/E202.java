import java.util.HashSet;

public class E202 {

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (true) {
            int sum = 0;

            if (seen.contains(n)) {
                return false;
            } else {
                seen.add(n);
            }

            while (n > 0) {
                int temp = n % 10;
                n /= 10;

                sum += (int) Math.pow(temp, 2);
            }

            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
        }
    }

}
