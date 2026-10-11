public class E605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) &&
                    flowerbed[i] == 0 &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;
                n--;
                if (n <= 0) return true; // przerwij od razu, gdy już posadziliśmy wszystkie kwiaty
            }
        }
        return n <= 0;
    }

}
