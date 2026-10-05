class Solution {
    public String makeGood(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (str.length() > 0) {

                char last = str.charAt(str.length() - 1);

                if (Character.toLowerCase(ch) == Character.toLowerCase(last)
                        && ch != last) {

                    str.deleteCharAt(str.length() - 1);
                } 
                else {
                    str.append(ch);
                }

            } 
            else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}