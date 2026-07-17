// Last updated: 7/17/2026, 2:06:56 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        TreeSet<Integer>treeSet=new TreeSet<>();
4        for(int val:arr){
5            treeSet.add(val);
6        }
7        int[]ans=new int[arr.length];
8        Map<Integer,Integer>map=new HashMap<>();
9        int rank=1;
10        for(int val:treeSet){
11            map.put(val,rank++);
12        }
13        int index=0;
14        for(int val:arr){
15            ans[index++]=map.get(val);
16        }
17        return ans;
18    }
19}