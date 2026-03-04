int divide(int dividend, int divisor) 
{
        if(dividend==INT_MIN && divisor==-1)
        {
            return INT_MAX;
        }
        int a;
        a=dividend/divisor;
        return a;
}