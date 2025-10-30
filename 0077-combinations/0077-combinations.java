class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> ls = new ArrayList<>();
    backtrack(n, k, 1, new ArrayList<>(), ls);
    return ls;
  }

  private void backtrack(int n, int k, int s, List<Integer> list, List<List<Integer>> ls) {
    if (list.size() == k) {
      ls.add(new ArrayList<>(list));
      return;
    }

    for (int i = s; i <= n; ++i) {
      list.add(i);
      backtrack(n, k, i + 1, list, ls);
      list.remove(list.size() - 1);
    }
    }
}