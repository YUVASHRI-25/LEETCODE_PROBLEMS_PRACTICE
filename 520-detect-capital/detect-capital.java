class Solution {
    public boolean detectCapitalUse(String word) 
    {
        int countUpper = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i))) 
            {
                countUpper++;
            }
        }
        if(countUpper == word.length()) 
        {
            return true;
        }
        if(countUpper == 0)
        {
            return true;  
        }
        if(countUpper == 1 && Character.isUpperCase(word.charAt(0))) 
        {
            return true;   
        }
        return false;   
    }
}
