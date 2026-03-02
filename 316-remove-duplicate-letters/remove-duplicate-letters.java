class Solution
{ 
    public String removeDuplicateLetters(String s)
    {
        if (s.length() == 0) return "";
        
        int[] count = new int[26]; 
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        int pos = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            
            count[s.charAt(i) - 'a']--;
            
            if (count[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }
        
        char chosen = s.charAt(pos);
      
        String remaining = s.substring(pos + 1).replaceAll(String.valueOf(chosen), "");
        
        return chosen + removeDuplicateLetters(remaining);
    }
}