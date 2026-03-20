class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int minDist = n; 

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    int dist = Math.abs(i - j);
                    if (dist < minDist) {
                        minDist = dist;
                    }
                }
            }

            result[i] = minDist;
        }

        return result;
    }
}