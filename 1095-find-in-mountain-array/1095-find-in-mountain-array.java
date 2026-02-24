class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int s = 0, e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        
        int peak = s;
        int left = binarySearch(mountainArr, target, 0, peak, true);
        if (left != -1) return left;
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    private int binarySearch(MountainArray arr, int target, int s, int e, boolean isAsc) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (isAsc) {
                if (val < target) s = mid + 1;
                else e = mid - 1;
            } else {
                if (val > target) s = mid + 1;
                else e = mid - 1;
            }
        }
        return -1;
    }
}