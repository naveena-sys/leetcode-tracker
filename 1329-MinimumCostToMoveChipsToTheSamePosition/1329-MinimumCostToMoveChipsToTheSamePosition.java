// Last updated: 7/11/2026, 2:03:12 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0,odd=0;
        for(int i=0;i<position.length;i++){
        if(position[i]%2==0) even++;
        else odd++;     
    }
        return Math.min(odd,even);
    }
}
