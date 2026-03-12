class Solution 
{
    public boolean canAliceWin(int[] nums) 
    {
        int single=0;
        int doubles=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10)
            {
                single=single+nums[i];
            }
            else
            {
                doubles=doubles+nums[i];
            }
        }
        if(single>doubles || doubles>single)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}