// Last updated: 7/11/2026, 2:05:39 PM
class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans=new StringBuilder();
        while(n>0){
            n--;
            int r=n%26;
            ans.append((char)(r+'A'));
            n/=26;
        }
        return ans.reverse().toString();  
    }
}