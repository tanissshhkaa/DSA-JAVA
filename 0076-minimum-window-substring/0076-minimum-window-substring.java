class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] freq = new int[128];  // ASCII
        for (char c : t.toCharArray()) {
            freq[c]++;
        }
        int left = 0, right = 0;
        int count = t.length();   // number of chars to be matched
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            char rChar = s.charAt(right);
            if (freq[rChar] > 0) {
                count--;
            }
            freq[rChar]--;
            right++;
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char lChar = s.charAt(left);
                freq[lChar]++;
                if (freq[lChar] > 0) {
                    count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
