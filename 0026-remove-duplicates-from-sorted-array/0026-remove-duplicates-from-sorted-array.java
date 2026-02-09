public class Solution {
     public int removeDuplicates(int[] nums) {
      int i=0;
      int s=0;
      for(;i<nums.length;i++){
        if(nums[i]!=nums[s]){
            s++;
            nums[s]=nums[i];
        }
      }
      return s+1;
    }
}
 