//We have n chips, where the position of the ith chip is position[i].
//
//We need to move all the chips to the same position. In one step, we can change the position of the ith chip from
// position[i] to:
//
//position[i] + 2 or position[i] - 2 with cost = 0.
//position[i] + 1 or position[i] - 1 with cost = 1.
//Return the minimum cost needed to move all the chips to the same position.

class MinimumCost {
    public static void main(String[] args) {
        int[] position = {1, 2, 3};  // Example input
        int minCost = minCostToMoveChips(position);
        System.out.println("Minimum Cost: " + minCost);
    }

    public static int minCostToMoveChips(int[] position) {
        int countEven = 0;
        int countOdd = 0;

        // Count chips at even and odd positions
        for (int chipPos : position) {
            if (chipPos % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Return the minimum of the two counts
        return Math.min(countEven, countOdd);
    }
}


