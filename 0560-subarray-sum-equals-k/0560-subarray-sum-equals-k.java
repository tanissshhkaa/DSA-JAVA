class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int elem = nums[i];
            if (elem == k) count++;
            int rem = elem - k;
            if (map.containsKey(rem)) 
                count = count + map.get(rem);
            if (map.containsKey(elem)) {
                int freq = map.get(elem);
                map.put(elem, freq + 1);
            } else {
                map.put(elem, 1);
            }
        }
        return count;
    }
}