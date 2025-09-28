// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int diff = Integer.MAX_VALUE;
//         int ans = 0;
//         for (int i = 0; i < nums.length - 2; i++) {
//             int left = i + 1;
//             int right = nums.length - 1;

//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];

//                 if (Math.abs(target - sum) < Math.abs(diff)) {
//                     diff = target - sum;
//                     ans = sum;
//                 }

//                 if (sum > target) {
//                     right--;
//                 } else {
//                     left++;   
//                 }
//             }
//         }
//         return ans;
//     }
// }
class Solution{
    public int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<Math.abs(diff)) {
                    diff=target-sum;
                    ans=sum;
                }
                if(sum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return ans;
    }
}