// Last updated: 7/11/2026, 2:03:06 PM
class Solution {
    public int xorOperation(int n, int start) {
       int result=0;
       for(int i=0;i<n;i++){
        int val= start+2*i;
        result ^=val;
       } 
       return result;
    }
}