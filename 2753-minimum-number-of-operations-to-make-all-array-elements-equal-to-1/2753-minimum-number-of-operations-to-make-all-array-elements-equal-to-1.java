class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length, ones=0,g=0;
        for(int x : nums){
            if(x==1) ones++;
            g=gcd(g,x);
        }
        if(ones>0) return n-ones;
        if(g>1) return -1;
        int minL=n;
        for(int i=0;i<n;i++){
            int curr=nums[i];
            for(int j=i;j<n && curr>1; j++){
                curr=gcd(curr,nums[j]);
                if(curr==1){
                    minL=Math.min(minL, j-i+1);
                    break;
                }
            }
        }
        return minL+n-2;
    }
    private int gcd(int a,int b) {
        return b==0 ? a : gcd(b, a%b);
    }
}