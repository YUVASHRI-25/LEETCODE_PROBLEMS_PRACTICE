class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int num = low; num <= high; num++) {
            String s = String.valueOf(num);

            if (s.length() % 2 != 0) {
                continue;
            }

            int firstSum = 0;
            int secondSum = 0;
            int mid = s.length() / 2;

            for (int i = 0; i < mid; i++) {
                firstSum += s.charAt(i) - '0';
            }

            for (int i = mid; i < s.length(); i++) {
                secondSum += s.charAt(i) - '0';
            }

            if (firstSum == secondSum) {
                count++;
            }
        }

        return count;
    }
}