import java.util.*;
class Solution {
    int n;
    HashMap<Integer, Integer> map = new HashMap<>();
    int[][] dp;
    public boolean canCross(int[] stones) {
        n = stones.length;
        for (int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }
        dp = new int[n][n + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(stones, 0, 0);
    }
    public boolean solve(int[] stones, int currIndex, int prevJump) {
        if (currIndex == n - 1) {
            return true;
        }
        if (dp[currIndex][prevJump] != -1) {
            return dp[currIndex][prevJump] == 1;
        }
        boolean result = false;
        for (int nextJump = prevJump - 1; nextJump <= prevJump + 1; nextJump++) {
            if (nextJump > 0) {
                int nextStone = stones[currIndex] + nextJump;
                if (map.containsKey(nextStone)) {
                    result = result || solve(stones, map.get(nextStone), nextJump);
                }
            }
        }
        dp[currIndex][prevJump] = result ? 1 : 0;
        return result;
    }
}