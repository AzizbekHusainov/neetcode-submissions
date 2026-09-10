class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int middlePoint = (r + l) / 2;

            if (target == nums[middlePoint]) {
                return middlePoint;
            } else if (target < nums[middlePoint]) {
                r = middlePoint - 1;
            } else {
                l = middlePoint + 1;
            }
        }
        return -1;
    }
}
