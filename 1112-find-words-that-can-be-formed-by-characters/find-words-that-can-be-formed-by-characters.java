class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;

        for (String word : words) {

            int[] count = new int[26];

            for (char c : chars.toCharArray()) {
                count[c - 'a']++;
            }

            boolean valid = true;

            for (char c : word.toCharArray()) {
                count[c - 'a']--;

                if (count[c - 'a'] < 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans += word.length();
            }
        }

        return ans;
    }
}