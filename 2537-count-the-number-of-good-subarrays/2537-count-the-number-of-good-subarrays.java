import java.util.*;

class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long pairs = 0, ans = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];
            int f = freq.getOrDefault(val, 0);
            pairs += f;
            freq.put(val, f + 1);
            while (pairs >= k) {
                ans += nums.length - right;
                int leftVal = nums[left];
                int leftFreq = freq.get(leftVal);
                freq.put(leftVal, leftFreq - 1);
                pairs -= (leftFreq - 1);
                left++;
            }
        }

        return ans;
    }
}