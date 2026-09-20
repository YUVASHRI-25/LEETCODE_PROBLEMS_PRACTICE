class Solution {
    public int reverseDegree(String s) {
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            int r=26-(s.charAt(i)-'a');
            a+=r*(i+1);
        }
        return a;
    }
}