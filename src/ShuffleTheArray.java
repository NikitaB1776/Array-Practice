//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//Example 1:
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

import java.util.Arrays;
import java.util.Scanner;
public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array");
        int arr = sc.nextInt();
        System.out.println("Enter the elements");
        int[] nums=new int[arr];
        for(int i=0;i<arr;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to shuffle");
        int n=sc.nextInt();

        int[] shuffle=shufflearray(nums,n);
        System.out.println(Arrays.toString(shuffle));


    }

    public static int[] shufflearray(int[] nums , int n)
    {
        int[] res=new int[2*n];
        for (int i=0;i<n;i++)
        {
            res[2*i]=nums[i];
            res[2*i+1]=nums[i+n];
        }
        return res;

    }
}
