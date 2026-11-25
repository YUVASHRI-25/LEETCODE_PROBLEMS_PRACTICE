class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        int[] dp1=new int[nums.length];
        dp[0]=nums[0];
        if(nums.length==1){
            return dp[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length-1;i++){
            dp[i]=Math.max((nums[i]+dp[i-2]),dp[i-1]);
        }
       
        dp1[1]=nums[1];
        dp1[2]=Math.max(nums[1],nums[2]);
        for(int i=3;i<nums.length;i++){
            dp1[i]=Math.max((nums[i]+dp1[i-2]),dp1[i-1]);
        }
        return Math.max(dp[nums.length-2],dp1[nums.length-1]);
    }
}