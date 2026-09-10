class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int value = Arrays.binarySearch(nums, target);
        if (value >= 0) {
            return value;
        } else { 
            return -1;
        }
    }
}
