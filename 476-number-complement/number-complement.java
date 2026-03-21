class Solution 
{
    public int findComplement(int num) 
    {
        String binary = Integer.toBinaryString(num);
        String result = "";
        for(char c : binary.toCharArray())
        {
            if(c == '0')
                result += '1';
            else
                result += '0';
        }
        return Integer.parseInt(result, 2);
    }
}