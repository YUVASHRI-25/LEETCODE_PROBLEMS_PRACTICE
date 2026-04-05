class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        
        int total = 0;
        
        for(int num : nums) {
            
            int temp = num;
            int maxDigit = 0;
            int digits = 0;

            while(temp > 0) {
                int d = temp % 10;
                if(d > maxDigit) {
                    maxDigit = d;
                }
                temp /= 10;
                digits++;
            }

            int encrypted = 0;
            for(int i = 0; i < digits; i++) {
                encrypted = encrypted * 10 + maxDigit;
            }
            
            total += encrypted;
        }
        
        return total;
    }
}