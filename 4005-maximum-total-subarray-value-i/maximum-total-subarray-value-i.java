class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long a=0;
        long b=Integer.MAX_VALUE;

        for (int num:nums) {
            if (num>a)a=num;
            if (num<b)b=num;
        }

        return (a-b) * 1L * k;
    }
}