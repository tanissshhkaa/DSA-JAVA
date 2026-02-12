class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int ls=0;
        int w=0;
        int n=nums.length;
        for(int right=0;right<n;right++){
            w=w+nums[right];
            while(w+k<right-left+1){
                w=w-nums[left];
                left++;
            }
            ls=Math.max(ls, right-left+1);
        }
        return ls;
    }
}