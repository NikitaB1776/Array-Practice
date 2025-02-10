//Given an integer n, return any array containing n unique integers such that they add up to 0.

import java.util.Arrays;

public class UniqueSumZero {
    public static int[] generateArray(int n) {
        int[] result = new int[n];
        int index = 0;

        // Add pairs of positive and negative integers
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;   // Positive number
            result[index++] = -i;  // Negative number
        }

        // If n is odd, add 0
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;  // Example input
        int[] result = generateArray(n);
        System.out.println(Arrays.toString(result));
    }
}


