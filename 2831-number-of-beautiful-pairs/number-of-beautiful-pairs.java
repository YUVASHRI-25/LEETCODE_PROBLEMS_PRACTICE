class Solution {
    
    public int countBeautifulPairs(int[] nums) {
        
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            int firstDigit = getFirstDigit(nums[i]);
            
            for(int j = i + 1; j < nums.length; j++) {
                
                int lastDigit = nums[j] % 10;
                
                if(gcd(firstDigit, lastDigit) == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }

    private int getFirstDigit(int num) {
        while(num >= 10) {
            num /= 10;
        }
        return num;
    }

    private int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}