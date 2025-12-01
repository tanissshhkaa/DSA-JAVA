class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
    static void quickSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int left = start;
        int right = end;
        int midIndex = (left + right) / 2;
        int pivotValue = nums[midIndex];
        while (left <= right) {
            while (nums[left] < pivotValue) left++;
            while (nums[right] > pivotValue) right--;
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(nums, start, right);
        quickSort(nums, left, end);
    }
}
