class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int i = 0;
        int count = 0;
        for (int j = 0; j < n; j++) {
            mp.put(fruits[j], mp.getOrDefault(fruits[j], 0) + 1);
            while (mp.size() > 2) {
                mp.put(fruits[i], mp.get(fruits[i]) - 1);
                if (mp.get(fruits[i]) == 0) {
                    mp.remove(fruits[i]);
                }
                i++;
            }
            
            count = Math.max(count, j - i + 1);
        }  
        return count;
    }
}