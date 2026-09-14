class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int seq = 1;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == (nums[i - 1] + 1)) {
                seq++;
                max = Math.max(max, seq);
                continue;
            }
            seq = 1;
        }
        return max;
    }
}
