import java.util.*;

public class M2352 {

    public static int equalPairs(int[][] grid) {
        int res = 0;
        List<List<Integer>> rows = new ArrayList<>();
        List<List<Integer>> cols = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            List<Integer> temp1 = new ArrayList<>();
            List<Integer> temp2 = new ArrayList<>();

            for (int j = 0; j < grid.length; j++) {
                temp1.add(grid[i][j]);
                temp2.add(grid[j][i]);
            }

            rows.add(temp1);
            cols.add(temp2);
        }

        Map<List<Integer>, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (rows.get(i).equals(cols.get(j))) res++;
            }
        }

        return res;
    }

}
