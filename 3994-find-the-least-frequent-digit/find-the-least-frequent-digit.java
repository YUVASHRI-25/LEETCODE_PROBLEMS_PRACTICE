class Solution {
    public int getLeastFrequentDigit(int n) {

        String s = Integer.toString(n);
        int[] freq = new int[10];
        for(int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            freq[digit]++;
        }

        int min = 100;
        int ans = 0;
        for(int i = 0; i < 10; i++) {
            if(freq[i] > 0 && freq[i] < min) {
                min = freq[i];
                ans = i;
            }
        }

        return ans;
    }
}