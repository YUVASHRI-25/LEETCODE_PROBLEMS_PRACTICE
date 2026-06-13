class Solution {
    public int pivotInteger(int n) {
        int a=n*(n+1)/2;
        int b=(int) Math.sqrt(a);
        if(b*b==a)
        {
            return b;
        }
        return -1;
    }
}