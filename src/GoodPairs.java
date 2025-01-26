//Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//Example 1:
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

import java.util.Scanner;
public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n =sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }

    public static int numIdenticalPairs(int[] nums) {
        int goodpairs=0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    goodpairs+=1;
                }
            }
        }
        return goodpairs;

    }
}
