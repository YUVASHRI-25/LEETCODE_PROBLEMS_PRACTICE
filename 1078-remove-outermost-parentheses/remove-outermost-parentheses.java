class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder a=new StringBuilder();
        int b=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                if(b>0)
                {
                    a.append(ch);
                }
                b++;
            }
            else
            {
                b--;
                if(b>0)
                {
                    a.append(ch);
                }
            }
        }
        return a.toString();
    }
}