// Last updated: 7/11/2026, 2:02:35 PM
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            total += cost[i];
            if (i - 1 >= 0)
                total += cost[i - 1];
        }
        return total;
    }
}