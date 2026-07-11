// Last updated: 7/11/2026, 2:02:44 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns)
            if (word.indexOf(s) != -1) count++; 
        return count;
    }
}