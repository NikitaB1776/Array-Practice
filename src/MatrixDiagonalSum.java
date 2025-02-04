//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements
// on the secondary diagonal that are not part of the primary diagonal.

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        // Define a sample square matrix
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculate the sum of diagonals
        int result = diagonalSum(mat);
        System.out.println("Sum of diagonals: " + result);
    }

    public static int diagonalSum(int[][] mat) {
        int sum_diagonals = 0;
        int n = mat.length;

        // Sum up primary and secondary diagonal elements
        for (int i = 0; i < n; i++) {
            sum_diagonals += mat[i][i];               // Primary diagonal
            sum_diagonals += mat[i][n - i - 1];       // Secondary diagonal
        }

        // Subtract the center element if matrix size is odd
        if (n % 2 == 1) {
            sum_diagonals -= mat[n / 2][n / 2];
        }

        return sum_diagonals;
    }
}

