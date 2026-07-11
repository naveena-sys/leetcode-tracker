// Last updated: 7/11/2026, 2:05:57 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            java.util.List<Integer> row = new java.util.ArrayList<>();
            row.add(1);
            
            for (int j = 1; j < i; j++) {
                row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            
            if (i > 0) row.add(1);
            
            res.add(row);
        }
        
        return res;
    }
}