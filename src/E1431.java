import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Arrays.stream(candies).max().orElse(0);

        for (int candie : candies) {
            if (candie + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }

}
