class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int temp;
        int sum=0;
        temp=x;
        while(temp>0)
        {
            int digit=temp%10;
            sum=sum+digit;
            temp=temp/10;

        }
        if(x%sum==0)
        {
            return sum;
        }
        else
        {
            return -1;
        }
    }
}