class Solution {
    public String convertDateToBinary(String date) {
        
        String[] parts = date.split("-");
        
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        String y = Integer.toBinaryString(year);
        String m = Integer.toBinaryString(month);
        String d = Integer.toBinaryString(day);
        
        return y + "-" + m + "-" + d;
    }
}