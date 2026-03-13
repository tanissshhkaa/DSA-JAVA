import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n,ans);
        return ans;
    }
     public void solve(String current, int open, int close, int n, List<String> ans) {
        if (current.length() == 2 * n) {
            ans.add(current);
            return;
        }
        if (open < n) {
            solve(current + "(", open + 1, close, n, ans);
        }
        if (close < open) {
            solve(current + ")", open, close + 1, n, ans);
        }
    }
}