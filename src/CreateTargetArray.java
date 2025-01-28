// Leetcode problem -- Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//Repeat the previous step until there are no elements to read in nums and index.

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        int[] result = new int[target.size()];
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the arrays
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        // Read nums array
        System.out.println("Enter the elements of the nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read index array
        System.out.println("Enter the elements of the index array:");
        for (int i = 0; i < n; i++) {
            index[i] = scanner.nextInt();
        }

        int[] target = createTargetArray(nums, index);

        System.out.println("Target Array: " + Arrays.toString(target));
    }
}

