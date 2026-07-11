// Last updated: 7/11/2026, 2:04:41 PM
public class Solution {
    public boolean wordPattern(String p, String s) {
        String[] w = s.split(" ");
        if (p.length() != w.length) return false;
        for (int i = 0; i < p.length(); i++) {
            if (p.indexOf(p.charAt(i)) != first(w, w[i], i)) return false;
        }
        return true;
    }
    int first(String[] w, String t, int lim) {
        for (int i = 0; i <= lim; i++) {
            if (same(w[i], t)) return i;
        }
        return -1;
    }
    boolean same(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}