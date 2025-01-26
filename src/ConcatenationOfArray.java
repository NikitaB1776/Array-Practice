// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements");
        int[] nums = new int[size];
        for(int i =0; i<size ; i++)
        {
            nums[i] = sc.nextInt();
        }

        int n = 2*size;
        int[] res = new int[n];

        for(int i = 0 ; i<size;i++)
        {
            res[i]=nums[i];
            res[i+size]=nums[i];
        }

        System.out.println(Arrays.toString(res));


    }
}

//logic
//Create an answer array of twice the length.
//Iterate in the nums array.
//We will put nums[i] at the (i)th index and (i+n)th index into the ans array.