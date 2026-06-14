class Solution {
    public int subsetXORSum(int[] nums) {
        int a=0;
        for(int num:nums)
        {
            a|=num;
        }
        return a<<(nums.length-1);
    }
}