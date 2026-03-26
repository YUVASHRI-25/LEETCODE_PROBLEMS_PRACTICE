class Solution 
{
    public long removeZeros(long n) 
    {
        String s = String.valueOf(n);   
        String result = "";

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != '0')   
            {
                result += s.charAt(i);
            }
        }

        return Long.parseLong(result);  
    }
}