//

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};  // Example input array
        int target = 9;              // Example target sum

        Solution solution = new Solution();
        int[] result = TwoSum.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[] {};  // Return empty array if no solution is found
    }
}
