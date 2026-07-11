// Last updated: 7/11/2026, 2:02:51 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }
        int[] freq = new int[maxCost + 1];
        for (int cost : costs) {
            freq[cost]++;
        }
        int barsBought = 0;
        for (int price = 1; price <= maxCost && price <= coins; price++) {
            if (freq[price] == 0) {
                continue;
            }
            int canBuy = Math.min(freq[price], coins / price);
            barsBought += canBuy;
            coins -= canBuy * price;
        }

        return barsBought;
    }
}