// Last updated: 7/11/2026, 2:02:53 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            count[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
