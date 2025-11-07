public class MinCostClimbingStairs {

    // Brute force recursive function to calculate the minimum cost to reach the top
    public static int minCost(int[] cost) {
        return Math.min(minCostHelper(cost, 0), minCostHelper(cost, 1));
    }

    // Helper function that calculates cost starting from the given step
    private static int minCostHelper(int[] cost, int i) {
        // Base case: if we are at or beyond the last step
        if (i >= cost.length) {
            return 0;
        }
        
        // Recursively calculate the cost of moving 1 step or 2 steps ahead
        int cost1 = cost[i] + minCostHelper(cost, i + 1);
        int cost2 = cost[i] + minCostHelper(cost, i + 2);
        
        // Return the minimum cost
        return Math.min(cost1, cost2);
    }

    public static void main(String[] args) {
        // Example: input array of costs
        int[] cost = {10, 15, 20};
        
        // Output the result
        System.out.println("Minimum cost to climb the stairs: " + minCost(cost));
    }
}
