import java.util.ArrayList;
import java.util.List;

public class M189 {

    public void rotate(List<Integer> nums, int k) {
        k %= nums.size();

        ArrayList<Integer> rotated = new ArrayList<>(nums);

        for (int i = 0; i < nums.size(); i++) {
            rotated.set((i + k) % nums.size(), nums.get(i));
        }

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, rotated.get(i));
        }
    }

}
