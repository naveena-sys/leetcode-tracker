// Last updated: 7/11/2026, 2:05:17 PM
class Solution {
    class TrieNode {
        TrieNode[] next = new TrieNode[26];
        String word;
    }
    
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        
        for (String w : words) {
            TrieNode node = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (node.next[i] == null) node.next[i] = new TrieNode();
                node = node.next[i];
            }
            node.word = w;
        }
        
        java.util.List<String> res = new java.util.ArrayList<>();
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res);
            }
        }
        
        return res;
    }
    
    private void dfs(char[][] b, int i, int j, TrieNode node, List<String> res) {
        char c = b[i][j];
        if (c == '#' || node.next[c - 'a'] == null) return;
        
        node = node.next[c - 'a'];
        
        if (node.word != null) {
            res.add(node.word);
            node.word = null;
        }
        
        b[i][j] = '#';
        
        if (i > 0) dfs(b, i - 1, j, node, res);
        if (j > 0) dfs(b, i, j - 1, node, res);
        if (i < b.length - 1) dfs(b, i + 1, j, node, res);
        if (j < b[0].length - 1) dfs(b, i, j + 1, node, res);
        
        b[i][j] = c;
    }
}