class Solution {
    public int numberOfSubstrings(String s) {
        int[] last = {-1, -1, -1};  // last seen indices of 'a', 'b', 'c'
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
            // Add number of valid substrings ending at index i
            count += 1 + Math.min(last[0], Math.min(last[1], last[2]));
        }
        return count;
    }
}