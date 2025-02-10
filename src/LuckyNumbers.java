
import java.util.ArrayList;
import java.util.List;

class LuckyNumbers {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return luckyNumbers;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int minColIndex = 0;
            int minRowValue = matrix[i][0];

            // Find the minimum in the current row
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minColIndex = j;
                }
            }

            // Check if it's the maximum in its column
            boolean isLucky = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][minColIndex] > minRowValue) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                luckyNumbers.add(minRowValue);
            }
        }

        return luckyNumbers;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test input matrix
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        // Display the lucky numbers
        List<Integer> result = LuckyNumbers.luckyNumbers(matrix);
        System.out.println("Lucky Numbers: " + result);  // Expected output: [15]
    }
}

