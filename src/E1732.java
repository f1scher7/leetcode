public class E1732 {

    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currAltitude = 0;

        for (int j : gain) {
            currAltitude += j;

            if (currAltitude > maxAltitude) {
                maxAltitude = currAltitude;
            }
        }

        return maxAltitude;
    }

}
