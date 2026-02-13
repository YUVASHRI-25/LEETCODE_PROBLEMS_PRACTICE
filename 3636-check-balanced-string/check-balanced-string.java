class Solution {
    public boolean isBalanced(String num) 
    {   
        
        int sum=0;
        int sum1=0;
        for(int i=0;i<num.length();i++)
        {   
            int digit=num.charAt(i) - '0';
            if(i%2==0)
            {
                sum+=digit;
            }
            else
            {
                sum1+=digit;
            }
        }
        if(sum==sum1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}