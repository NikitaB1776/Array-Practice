
class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        // Initialize variables
        int maxCurrent = nums[0]; // Maximum sum of the current subarray
        int maxGlobal = nums[0]; // Maximum sum found so far

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Either add the current element to the existing subarray or start a new subarray
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);

            // Update the global maximum if necessary
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        // Return the maximum sum
        return maxGlobal;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test input
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Output the result
        System.out.println("Maximum Subarray Sum: " + MaxSubArray.maxSubArray(nums)); // Expected output: 6
    }
}


