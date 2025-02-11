//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

import java.util.Arrays;

class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;  // Example input size
        int[][] matrix = generateMatrix(n);

        // Print the result
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (num <= n * n) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }
}


