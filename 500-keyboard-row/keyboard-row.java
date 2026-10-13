
class Solution {
    public String[] findWords(String[] words) {
        String[] result = new String[words.length];
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String s = words[i].toLowerCase();

            boolean row1 = true;
            boolean row2 = true;
            boolean row3 = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if ("qwertyuiop".indexOf(c) == -1) {
                    row1 = false;
                }
                if ("asdfghjkl".indexOf(c) == -1) {
                    row2 = false;
                }
                if ("zxcvbnm".indexOf(c) == -1) {
                    row3 = false;
                }
            }

            if (row1 || row2 || row3) {
                result[count] = words[i];
                count++;
            }
        }

        return java.util.Arrays.copyOf(result, count);
    }
}
