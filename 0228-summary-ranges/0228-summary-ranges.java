class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            final int begin=nums[i];
            while(i+1<nums.length && nums[i]==nums[i+1]-1)
            i++;
            final int end=nums[i];
            if(begin==end)
            ls.add(""+begin);
            else
            ls.add(""+begin+"->"+end);
        }
        return ls;    
    }
}