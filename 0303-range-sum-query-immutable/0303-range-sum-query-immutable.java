// class NumArray {
// private int[] prefixSum;
//     public NumArray(int[] nums) {
//         int n = nums.length;
//         prefixSum = new int[n];
//         prefixSum[0] = nums[0];
//         for (int i = 1; i < n; i++) {
//             prefixSum[i] = prefixSum[i - 1] + nums[i];
//         }
//     }
//     public int sumRange(int left, int right) {
//         if (left == 0) {
//             return prefixSum[right];
//         } else {
//             return prefixSum[right] - prefixSum[left - 1];
//         } 
//     }       
// }

class NumArray {
    private int[] prefixSum;
    public NumArray(int[] nums) {
       int n = nums.length;
       prefixSum = new int[n + 1]; 
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }
   
    public int sumRange(int left, int right) {
         return prefixSum[right + 1] - prefixSum[left];
    }
}


