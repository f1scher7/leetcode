import java.util.Arrays;

public class M274 {

    public static int hIndex(int[] citations) {
        int hIndex = 0;

        Arrays.sort(citations);

        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > hIndex) {
                hIndex++;
            } else {
                return hIndex;
            }
        }

        return hIndex;
    }

}
