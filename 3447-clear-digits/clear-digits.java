class Solution {
    public String clearDigits(String s) {

        String result = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c >= '0' && c <= '9') {
                if(result.length() > 0) {
                    result = result.substring(0, result.length() - 1);
                }
            } 
            else {
                result = result + c;
            }
        }

        return result;
    }
}