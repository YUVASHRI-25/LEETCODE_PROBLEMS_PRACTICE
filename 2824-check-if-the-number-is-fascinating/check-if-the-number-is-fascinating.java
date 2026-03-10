class Solution 
{
    public boolean isFascinating(int n)
    {
        int a = 2 * n;
        int b = 3 * n;
        
        String s = String.valueOf(n) + String.valueOf(a) + String.valueOf(b);
        
        if(s.length() != 9) return false;
        
        int[] freq = new int[10];
        
        for(int i = 0; i < s.length(); i++)
        {
            int digit = s.charAt(i) - '0';
            
            if(digit == 0) return false;
            
            freq[digit]++;
            
            if(freq[digit] > 1) return false;
        }
        
        return true;
    }
}