import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve("", 0, 0, n, result);
        return result;
    }
    void solve(String current, int open, int close, int n, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            solve(current + "(", open + 1, close, n, result);
        }
        if (close < open) {
            solve(current + ")", open, close + 1, n, result);
        }
    }
}