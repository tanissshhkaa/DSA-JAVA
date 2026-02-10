class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0]=nums[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        int[] result = new int[queries.length];
        for(int i = 0;i < queries.length;i++){
            int q = queries[i];
            int left = 0, right = n - 1, ls = -1;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(prefix[mid] <= q) {
                    ls = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            result[i] = ls+1;
        }
        return result;
        }
    }