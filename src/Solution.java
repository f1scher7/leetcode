import java.util.*;

public class Solution {

    // we can also normalize keys (colors) with toLowerCase()
    // using int[] cause of better performance
    private static final Map<String, int[]> COLOR_MAP = Map.of(
            "Red", new int[]{255, 0, 0},
            "Green", new int[]{0, 255, 0},
            "Blue", new int[]{0, 0, 255},
            "Black", new int[]{0, 0, 0},
            "White", new int[]{255, 255, 255}
    );
    private static final String AMBIGUOUS = "Ambiguous";


    public static List<String> convertPixels(List<String> pixelList) {
        List<String> convertedPixelList = new ArrayList<>();

        for (String pixel : pixelList) {
            if (pixel.length() != 24) throw new IllegalArgumentException("String must to be 24 bits");

            int r = Integer.parseInt(pixel.substring(0, 8), 2);
            int g = Integer.parseInt(pixel.substring(8, 16), 2);
            int b = Integer.parseInt(pixel.substring(16, 24), 2);

            String closestColor = closestColor(r, g, b);
            convertedPixelList.add(closestColor);
        }

        return convertedPixelList;
    }

    public static String closestColor(int r, int g, int b) {
        List<String> closestColorList = new ArrayList<>();
        double minDistance = Double.MAX_VALUE;

        for (Map.Entry<String, int[]> entry : COLOR_MAP.entrySet()) {
            int[] rgb = entry.getValue();

            double distance = Math.sqrt(
                    Math.pow(r - rgb[0], 2) + Math.pow(g - rgb[1], 2) + Math.pow(b - rgb[2], 2)
            );

            if (distance < minDistance) {
                minDistance = distance;
                closestColorList.clear();
                closestColorList.add(entry.getKey());
            } else if (distance == minDistance) {
                closestColorList.add(entry.getKey());
            }
        }

        if (closestColorList.size() > 1) {
            return AMBIGUOUS;
        } else {
            return closestColorList.get(0);
        }
    }

    public static void main(String[] args) {
        List<String> pixelList = Arrays.asList(
                "100000000000000000000000",
                "000000001111111100000000",
                "111111110000000011111111",
                "000000000000000000000000"
        );

        List<String> colors = convertPixels(pixelList);

        for (int i = 0; i < pixelList.size(); i++) {
            System.out.println("Pixel " + i + " (" + pixelList.get(i) + "): " + colors.get(i));
        }
    }

}
