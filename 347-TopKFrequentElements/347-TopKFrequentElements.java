// Last updated: 7/11/2026, 2:04:29 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        
        java.util.List<Integer>[] bucket = new java.util.ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) bucket[freq] = new java.util.ArrayList<>();
            bucket[freq].add(key);
        }
        
        int[] res = new int[k];
        int idx = 0;
        
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[idx++] = num;
                    if (idx == k) break;
                }
            }
        }
        
        return res;
    }
}