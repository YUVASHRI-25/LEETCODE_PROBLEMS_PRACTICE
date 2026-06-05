class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int a=0;
        for(int candy:candies)
        {
            a=Math.max(a,candy);
        }
        List<Boolean> r=new ArrayList<>();
        for(int candy:candies)
        {
            r.add(candy + extraCandies >=a);
        }
        return r;
        
    }
}