// Build array from permutation

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[6];

        int[] result = new int[6];

        for(int i =0; i<nums.length ; i++)
        {
            nums[i] = sc.nextInt();
        }

        for(int i =0; i<nums.length ; i++)
        {
            result[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(result));
    }
}




// second approach for leetcode

//import java.util.Scanner;
//
//class Solution {
//    public int[] buildArray(int[] nums) {
//        {
//            int n = nums.length;
//            int[] ans = new int[n];
//            for(int i=0; i<nums.length;i++){
//                ans[i]= nums[nums[i]];
//            }
//
//            return ans;
//        }
//    }
//}

