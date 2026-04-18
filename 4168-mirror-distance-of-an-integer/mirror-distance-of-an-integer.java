class Solution
 {
    public int mirrorDistance(int n)
    {
        int rem,rev=0;
        int temp=n;
       while(temp>0)
       {
          rem=temp%10;
          rev=rev*10+rem;
          temp/=10;
       }
        return Math.abs(n-rev);
        
    }
}