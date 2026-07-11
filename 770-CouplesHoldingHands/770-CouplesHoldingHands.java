// Last updated: 7/11/2026, 2:03:49 PM
class Solution {
    public int minSwapsCouples(int[] row) {
        int n = row.length;
        int[] pos = new int[n]; // store positions of each person
        
        // Fill position array
        for (int i = 0; i < n; i++) {
            pos[row[i]] = i;
        }

        int ans = 0;

        // Process pairs (step by 2)
        for (int i = 0; i < n; i += 2) {
            int first = row[i];
            int expected = first ^ 1; // partner is always number ^ 1

            if (row[i + 1] != expected) {
                ans++;

                int partnerPos = pos[expected]; // position of the expected partner

                // Update pos for the one currently at i+1
                pos[row[i + 1]] = partnerPos;
                pos[expected] = i + 1;

                // Swap to bring expected partner next to first
                int temp = row[i + 1];
                row[i + 1] = row[partnerPos];
                row[partnerPos] = temp;
            }
        }

        return ans;
    }
}
