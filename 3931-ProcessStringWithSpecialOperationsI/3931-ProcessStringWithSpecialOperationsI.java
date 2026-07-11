// Last updated: 7/11/2026, 2:01:37 PM
class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                ans.append(c);
            }
            else if (c == '*') { // remove one char
                if (ans.length() > 0) {
                    ans.deleteCharAt(ans.length() - 1);
                }
            }
            else if (c == '#') { // duplicate
                ans.append(ans.toString());
            }
            else { // '%'
                ans.reverse();
            }
        }
        return ans.toString();
    }
}