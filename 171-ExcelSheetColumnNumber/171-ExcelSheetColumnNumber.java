// Last updated: 7/11/2026, 2:05:36 PM
class Solution {
    public int titleToNumber(String  str) {
        int res=0;
        for(char i : str.toCharArray()){
            res = res*26 + (i - 'A' + 1);
        }
        return res;
    }
}