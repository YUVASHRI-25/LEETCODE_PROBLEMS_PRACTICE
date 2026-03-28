class Solution 
{
    public int findMaxK(int[] nums) 
    {
        int max = -1;
        
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == -nums[j] && nums[i] > 0)
                {
                    max = Math.max(max, nums[i]);
                }
            }
        }
        
        return max;
    }
}