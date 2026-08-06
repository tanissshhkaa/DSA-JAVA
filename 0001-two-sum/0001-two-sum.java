import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int first=nums[i];
        int second=target-first;
        if(map.containsKey(second)){
            return new int[] {i,map.get(second)};
        }
        map.put(first,i);
      }
      return new int[]{};
    }
}