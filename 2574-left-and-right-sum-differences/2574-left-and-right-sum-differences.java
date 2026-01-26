class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ls=new int[nums.length];
        int leftSum=0;
        int rightSum=Arrays.stream(nums).sum();
        for(int i=0;i<nums.length;i++){
            rightSum -=nums[i];
            ls[i]=Math.abs(leftSum-rightSum);
           leftSum+=nums[i];
        }
        return ls;
    }
}