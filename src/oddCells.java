//There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
//
//For each location indices[i], do both of the following:
//
//Increment all the cells on row ri.
//Increment all the cells on column ci.
//Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

//class Solution {
//    public int oddCells(int m, int n, int[][] indices) {
//        // Arrays to track row and column increments
//        int[] row = new int[m];
//        int[] col = new int[n];
//
//        // Increment counters for rows and columns based on indices
//        for (int[] index : indices) {
//            row[index[0]]++;
//            col[index[1]]++;
//        }
//
//        int count = 0;
//
//        // Calculate odd-valued cells by checking row + column increments
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if ((row[i] + col[j]) % 2 != 0) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
//}

// taking user input

import java.util.Scanner;

public class oddCells {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        // Input number of operations
        System.out.print("Enter the number of index operations: ");
        int k = scanner.nextInt();

        // Input indices array
        int[][] indices = new int[k][2];
        System.out.println("Enter the indices (row and column pairs):");
        for (int i = 0; i < k; i++) {
            indices[i][0] = scanner.nextInt(); // row index
            indices[i][1] = scanner.nextInt(); // column index
        }

        // Compute result and display
        int result = oddCells(m, n, indices);
        System.out.println("Number of odd-valued cells: " + result);

        scanner.close();
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        // Increment row and column counts
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        int count = 0;

        // Count odd cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

