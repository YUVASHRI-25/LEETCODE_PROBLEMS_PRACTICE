class Solution {
    public int maxSubArray(int[] nums) {
        int a=nums[0];
        int b=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            a=Math.max(nums[i],a+nums[i]);
            b=Math.max(b,a);
        }
        return b;
    }
}