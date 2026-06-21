class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] count = new int[100001];

        for (int cost : costs) {
            count[cost]++;
        }

        int bars = 0;

        for (int cost = 1; cost <= 100000; cost++) {
            if (count[cost] == 0) continue;

            int canBuy = Math.min(count[cost], coins / cost);

            bars += canBuy;
            coins -= canBuy * cost;

            if (coins < cost) {
                break;
            }
        }

        return bars;
    }
}