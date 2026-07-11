// Last updated: 7/11/2026, 2:03:41 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}