//Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n =sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }


        int[] result= smallerNumbersThanCurrent(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }


    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j] && i != j)
                {
                    result[i]+=1;
                }
            }
        }
        return result;

    }
}
