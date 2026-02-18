class Solution {
    public String reorganizeString(String s) {
        int[] freq=new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<26;i++){
            if(freq[i]>0) pq.offer(new int[]{i,freq[i]});
        }
    int[] prev={-1,0};
    StringBuilder sb=new StringBuilder();
    while(!pq.isEmpty()){
        int[] curr=pq.poll();
        sb.append((char)(curr[0]+'a'));
        curr[1]--;
        if(prev[1]>0) pq.offer(prev);
        prev=curr;
    }
    return sb.length()==s.length()?sb.toString():"";
    }
}