class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int secondLargest = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';

                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit < largest && digit > secondLargest) {
                    secondLargest = digit;
                }
            }
        }

        return secondLargest;
    }
}