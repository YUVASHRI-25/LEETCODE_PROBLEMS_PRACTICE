class Solution {
    public String makeSmallestPalindrome(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (arr[left] != arr[right]) {

                if (arr[left] < arr[right]) {
                    arr[right] = arr[left];
                } else {
                    arr[left] = arr[right];
                }
            }

            left++;
            right--;
        }

        return new String(arr);
    }
}