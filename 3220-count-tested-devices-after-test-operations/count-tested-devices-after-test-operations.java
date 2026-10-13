class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count=0;
        for(int i=0;i<batteryPercentages.length;i++)
        {
            if( batteryPercentages[i]>count)
            {
                count++;
            }
        }
        return count;
    }
}