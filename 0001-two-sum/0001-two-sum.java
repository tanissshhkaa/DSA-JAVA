import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int first=nums[i];
        int second=target-first;
        if(mp.containsKey(second)){
            return new int[]{i,mp.get(second)} ;
        }
        mp.put(first,i);
    }
    return new int[]{};
    }
}