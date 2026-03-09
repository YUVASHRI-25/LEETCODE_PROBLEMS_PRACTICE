class Solution 
{
    public int gcdOfOddEvenSums(int n)
    {
        int a=0,b=0;
        for(int i=0;i<n*2;i++)
        {
            if(i%2==0)
            {
                a=a+i;
            }
            else
            {
                b=b+i;
            }
            
        }
    
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}