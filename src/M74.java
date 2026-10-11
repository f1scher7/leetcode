public class M74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int secondLen = matrix[0].length;

        for (int[] ints : matrix) {
            if (target >= ints[0] && target <= ints[secondLen - 1]) {
                int left = 0;
                int right = secondLen - 1;

                while (left < right) {
                    int middle = left + (right - left) / 2;

                    if (ints[middle] == target) {
                        return true;
                    } else if (ints[middle] < target) {
                        left = middle + 1;
                    } else {
                        right = middle - 1;
                    }
                }
            }
        }

        return false;
    }

}
