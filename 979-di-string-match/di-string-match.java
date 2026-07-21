class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];

        int low = 0;
        int high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = low;
                low++;
            } else {
                ans[i] = high;
                high--;
            }
        }

        ans[n] = low;  

        return ans;
    }
}