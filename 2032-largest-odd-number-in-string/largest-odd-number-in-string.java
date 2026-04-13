class Solution {
    public String largestOddNumber(String num) {
        String ans = "";

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

          
            if ((ch - '0') % 2 == 1) {
                ans = num.substring(0, i + 1);
            }
        }

        return ans;
    }
}