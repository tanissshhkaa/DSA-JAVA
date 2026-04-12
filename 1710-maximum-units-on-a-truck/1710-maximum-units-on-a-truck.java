class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
int maxUnits=0;
for(int[] box:boxTypes){
    int boxesToPut=Math.min(truckSize,box[0]);
    maxUnits+=boxesToPut*box[1];
    truckSize-=boxesToPut;
    if(truckSize==0){
        break;
    }
}
return maxUnits;
    }
    }