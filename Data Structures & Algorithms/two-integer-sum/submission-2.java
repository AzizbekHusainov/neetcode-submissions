class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                array[0] = Math.min(i, map.get(nums[i]));
                array[1] = Math.max(i, map.get(nums[i]));
                return array;
            }
            map.put(target - nums[i], i);
        }
        return nums;
    }
}
