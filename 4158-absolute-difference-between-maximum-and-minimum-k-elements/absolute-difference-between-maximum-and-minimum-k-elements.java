class Solution {
    public int absDifference(int[] nums, int k) {
      Arrays.sort(nums);
      int s=0;
      int l=0;
      int n=nums.length;
      for(int i=0;i<k;i++)
      {
        s+=nums[i];
        l+=nums[n-1-i];
      }  
      return Math.abs(l-s);
    }
}