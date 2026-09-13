class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int max = 0;
        for (int rowShift = -n + 1; rowShift <= n - 1; rowShift++) {
            for (int colShift = -n + 1; colShift <= n - 1; colShift++) {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int newI = i + rowShift;
                        int newJ = j + colShift;
                        if (newI >= 0 && newI < n &&
                            newJ >= 0 && newJ < n) {
                            if (img1[i][j] == 1 && img2[newI][newJ] == 1) {
                                count++;
                            }
                        }
                    }
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}