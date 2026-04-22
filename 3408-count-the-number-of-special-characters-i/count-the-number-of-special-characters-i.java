class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;

       
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean hasLower = false;
            boolean hasUpper = false;

         
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    hasLower = true;
                }
                if (word.charAt(i) == Character.toUpperCase(ch)) {
                    hasUpper = true;
                }
            }
            if (hasLower && hasUpper) {
                count++;
            }
        }

        return count;
    }
}