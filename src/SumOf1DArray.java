// running the sum of 1D array

import java.util.Arrays;
import java.util.Scanner;

public class SumOf1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array");
        int size=sc.nextInt();
        System.out.println("Enter the "+size+"elements");
        int[] nums=new int[size];
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        int[] sum= new int[size];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){

            sum[i]=sum[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}

// leetcode solution
//class Solution {
//    public int[] runningSum(int[] nums) {
//        int[] runningsum = new int[nums.length];
//        runningsum[0]=nums[0];
//
//        for(int i=1;i<nums.length;i++)
//        {
//            runningsum[i]=runningsum[i-1]+nums[i];
//        }
//        return runningsum;
//    }
//}
