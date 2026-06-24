class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] count = new int[100];
        int[] ans = new int[2];

        int index = 0;

        for(int num : nums) {

            count[num]++;

            if(count[num] == 2) {
                ans[index++] = num;
            }
        }

        return ans;
    }
}