class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a=0;
        for(int num:nums)
        {
            a+=num;
        }
        int b=0;
        int[] c= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a-=nums[i];
            c[i]=Math.abs(b - a);
            b+=nums[i];
        }
        return c;
    }
}