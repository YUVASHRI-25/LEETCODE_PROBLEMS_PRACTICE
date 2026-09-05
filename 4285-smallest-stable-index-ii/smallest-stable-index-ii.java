class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        // Store minimum from i to end
        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < suffixMin[i + 1]) {
                suffixMin[i] = nums[i];
            } else {
                suffixMin[i] = suffixMin[i + 1];
            }
        }

        // Find prefix maximum and check
        int max = nums[0];

        for (int i = 0; i < n; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }

            int score = max - suffixMin[i];

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }
}