class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long ls1[] =new long[n]; long ls2[]=new long[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n ;i++){
            ls1[i] = nums[i]+Math.max(max,nums[i]);
            if(nums[i]>max){
                max = nums[i];
            }
        }
        ls2[0]=ls1[0];
        for(int i =1;i<n ;i++){
            ls2[i]=ls2[i-1]+ls1[i];
        }
        return ls2;
    }
}