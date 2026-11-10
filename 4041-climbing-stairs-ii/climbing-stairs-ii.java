class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=Integer.MAX_VALUE;
            for(int j=1;j<=3;j++){
                if(i-j>=0){
                    arr[i]=Math.min(arr[i],arr[i-j]+costs[i-1]+j*j);
                }
            }
        }
        return arr[n];
    }
}