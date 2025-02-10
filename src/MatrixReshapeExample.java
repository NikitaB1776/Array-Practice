//You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//
//The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing
// order as they were.
//
//If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
// Otherwise, output the original matrix.

import java.util.Arrays;

public class MatrixReshapeExample {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        // Check if reshaping is possible
        if (rows * cols != r * c) {
            System.out.println("Reshape not possible. Returning the original matrix.");
            return mat;
        }

        int[][] reshapedMatrix = new int[r][c];

        // Map elements from the original matrix to the reshaped matrix
        for (int i = 0; i < rows * cols; i++) {
            reshapedMatrix[i / c][i % c] = mat[i / cols][i % cols];
        }

        return reshapedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        // Input defined in code
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        int r = 1, c = 4;

        System.out.println("Original Matrix:");
        printMatrix(mat);

        int[][] reshapedMatrix = matrixReshape(mat, r, c);

        System.out.println("\nReshaped Matrix:");
        printMatrix(reshapedMatrix);
    }
}


