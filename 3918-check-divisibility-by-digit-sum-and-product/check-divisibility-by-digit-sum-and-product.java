class Solution {
    public boolean checkDivisibility(int n)
    {   
        int temp;
        temp=n;
        int sum=0,mul=1;
        while(temp>0)
        {
        int digit=temp%10;
        sum=sum+digit;
        mul=mul*digit;
        temp=temp/10;
        }
        if(n%(sum+mul)==0)
        {
            return true;
        }
        else
        {
            return false;
        }



    }
}