class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[3];
        for (int i = 1; i <= n; i++) {
            int low = Integer.MAX_VALUE;
            if (i >= 1) low = Math.min(low, dp[(i - 1) % 3] + 1);
            if (i >= 2) low = Math.min(low, dp[(i - 2) % 3] + 4);
            if (i >= 3) low = Math.min(low, dp[(i - 3) % 3] + 9);
            dp[i % 3] = low + costs[i - 1];
        }
        return dp[n % 3];
    }
}