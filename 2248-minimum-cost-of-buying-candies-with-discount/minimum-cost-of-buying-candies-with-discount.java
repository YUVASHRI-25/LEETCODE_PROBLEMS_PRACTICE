class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int x=0;
        int y=0;
        for(int i=cost.length -1 ;i>=0;i--)
        {
            y++;
            if(y%3!=0)
            {
                x+=cost[i];
            }
        }
        return x;
    }
}