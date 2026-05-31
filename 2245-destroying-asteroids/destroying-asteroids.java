class Solution 
{
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
        Arrays.sort(asteroids);
        long c=mass;
        for(int asteroid:asteroids)
        {
            if(c<asteroid)
            {
                return false;
            }
            c+=asteroid;
        }
        return true;
    }
}