class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        
        int[] freq = new int[101];


        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }

    
        for(int i = 0; i < 101; i++){
            int count = freq[i];

            if(count > 1){
                int c = 0;

                for(int j = 1; j <= count; j++){
                    if(count % j == 0){
                        c++;
                    }
                }

                if(c == 2){
                    return true;
                }
            }
        }

        return false;
    }
}