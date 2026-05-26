class Solution {
    public int mostFrequent(int[] nums, int key) {

        int ans = 0;
        int maxCount = 0;

        for (int target : nums) {

            int count = 0;

            for (int i = 0; i < nums.length - 1; i++) {

                if (nums[i] == key && nums[i + 1] == target) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                ans = target;
            }
        }

        return ans;
    }
}