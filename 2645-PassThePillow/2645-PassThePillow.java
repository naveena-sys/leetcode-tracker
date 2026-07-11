// Last updated: 7/11/2026, 2:02:14 PM
class Solution {
    public int passThePillow(int n, int time) {
        int turn = ((n-1)*2);
        time%=turn;
        if(time<n) return time+1;
        return (turn-time+1);   
    }
}