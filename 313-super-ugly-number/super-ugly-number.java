class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int m=primes.length;
        int[] dp=new int[n];
        int[] index=new int[m];
        long[] val=new long[m];
        dp[0]=1;
        for(int i=0;i<m;i++){
            val[i]=primes[i];
        }
        for(int i=1;i<n;i++){
            long min=Long.MAX_VALUE;
            for(int j=0;j<m;j++){
                min=Math.min(min,val[j]);
            }
            dp[i]=(int)min;
            for(int j=0;j<m;j++){
                if(val[j]==min){
                    index[j]++;
                    val[j]=(long)dp[index[j]]*primes[j];
                }
            }
        }
        return dp[n-1];
    }
}