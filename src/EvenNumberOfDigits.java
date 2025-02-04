//Given an array nums of integers, return how many of them contain an even number of digits.

//class Solution {
//    public int findNumbers(int[] nums) {
//        int n =nums.length;
//        int count =0;
//
//        for(int i=0;i<n;i++){
//            if(String.valueOf(nums[i]).length()%2==0){
//                count++;
//
//            }
//         }
//         return count;
//    }
//}
import java.util.Scanner;
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] nums = new int[n];

        // Prompt user to enter the numbers
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the findNumbers method and print the result
        int result = findNumbers(nums);
        System.out.println("Count of numbers with an even number of digits: " + result);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            // Count digits using division
            int digits = 0;
            if (num == 0) {
                digits = 1; // Special case for 0
            } else {
                while (num > 0) {
                    num /= 10; // Divide by 10 to remove the last digit
                    digits++;  // Increment the digit count
                }
            }

            // Check if the number of digits is even
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}




