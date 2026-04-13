import java.text.*;

class Solution {
    public String thousandSeparator(int n) {
        return new DecimalFormat("#,###").format(n).replace(',', '.');
    }
}