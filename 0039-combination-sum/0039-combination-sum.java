class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void solve(int[] candidates, int target, int i, List<Integer> combination, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (i >= candidates.length || sum >= target) {
            return;
        }
        combination.add(candidates[i]);
        solve(candidates, target, i, combination, sum + candidates[i]);

        combination.remove(combination.size() - 1);
        solve(candidates, target, i + 1, combination, sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(candidates, target, 0, new ArrayList<>(), 0);
        return result;
    }
}