import java.util.*;
public class Solution {
    public boolean containsAll(Map<Character, Integer> windowFreq, Map<Character, Integer> targetFreq) {
        for (char c : targetFreq.keySet()) {
            if (windowFreq.getOrDefault(c, 0) < targetFreq.get(c)) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }
        int minLen = Integer.MAX_VALUE;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> windowFreq = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                windowFreq.put(ch, windowFreq.getOrDefault(ch, 0) + 1);
                if (containsAll(windowFreq, targetFreq)) {
                    if ((j - i + 1) < minLen) {
                        minLen = j - i + 1;
                        result = s.substring(i, j + 1);
                    }
                    break; 
                }
            }
        }

        return result;
    }
}
