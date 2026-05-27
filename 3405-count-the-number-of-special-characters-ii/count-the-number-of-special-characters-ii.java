class Solution
{
    public int numberOfSpecialChars(String word) 
    {
        int count=0;
        for(char ch='a';ch<='z';ch++)
        {
            int small=word.lastIndexOf(ch);
            int capital=word.indexOf(Character.toUpperCase(ch));
            if(small != -1 && capital !=-1 && small<capital)
            {
                count++;
            }
        }
        return count;
    }
}