
class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            String result = "";

            for (int i = 0; i < s.length(); i = i + k) {

                String str = s.substring(i, Math.min(i + k, s.length()));

                int sum = 0;

                for (int j = 0; j < str.length(); j++) {
                    sum = sum + (str.charAt(j) - '0');
                }

                result = result + sum;
            }

            s = result;
        }

        return s;
    }
}
