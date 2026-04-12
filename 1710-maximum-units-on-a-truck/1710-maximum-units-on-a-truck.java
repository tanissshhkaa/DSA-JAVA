class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
    int total = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int boxCount = boxTypes[i][0];
            int units = boxTypes[i][1];
            if (truckSize >= boxCount) {
                total += boxCount * units;
                truckSize -= boxCount;
            } else {
                total += truckSize * units;
                break;
            }
        }
        return total;
    }
}