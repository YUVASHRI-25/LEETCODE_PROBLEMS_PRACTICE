class Solution {
    public int missingMultiple(int[] nums, int k) {
  
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        int multiple = k;

        while (true) {
            if (!set.contains(multiple)) {
                return multiple;
            }
            multiple += k;
        }
    }
}