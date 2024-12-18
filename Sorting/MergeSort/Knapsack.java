public class Knapsack {
    // Method to solve the Knapsack Problem
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        // Create a DP table where dp[i][j] represents the maximum value
        // for the first 'i' items with a knapsack capacity of 'j'.
        int[][] dp = new int[n + 1][capacity + 1];

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    // Include the item or exclude it
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    // Exclude the item
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // The maximum value is stored in dp[n][capacity]
        return dp[n][capacity];
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4};  // Weights of items
        int[] values = {10, 20, 30, 40}; // Values of items
        int capacity = 5; // Maximum capacity of the knapsack

        int maxValue = knapsack(weights, values, capacity);

        System.out.println("Maximum value in the knapsack: " + maxValue);
    }
}
