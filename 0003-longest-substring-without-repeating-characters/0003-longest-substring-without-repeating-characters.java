class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int ws = 0;
        int we = 0;
        HashSet<Character> hs = new HashSet<>();
        for (; we < s.length(); we++) {
            while (hs.contains(s.charAt(we))) {
                hs.remove(s.charAt(ws));
                ws++;
            }
            hs.add(s.charAt(we));
            length = Math.max(length, we - ws + 1);
        }
        return length;
    }
}

