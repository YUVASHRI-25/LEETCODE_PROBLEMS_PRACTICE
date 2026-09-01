class Solution {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int bits1 = countBits(arr[j]);
                int bits2 = countBits(arr[j + 1]);
                if (bits1 > bits2 ||
                   (bits1 == bits2 && arr[j] > arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public int countBits(int n) {

        int count = 0;

        while (n > 0) {

            if (n % 2 == 1) {
                count++;
            }

            n = n / 2;
        }

        return count;
    }
}