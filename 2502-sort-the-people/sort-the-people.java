class Solution {
    public String[] sortPeople(String[] names, int[] heights) 
    
    {
        int n=names.length;
        String[] result = new String[n];
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=1;j<n;j++)
            {
                if(heights[j]>heights[max])
                {
                    max=j;
                }
            }
            result[i]=names[max];
            heights[max]=-1;
        }
        return result;
    }
}