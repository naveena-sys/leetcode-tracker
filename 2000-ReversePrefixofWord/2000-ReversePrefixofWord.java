// Last updated: 8/7/2026, 3:59:45 PM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int r=word.indexOf(ch);
4        int l=0;
5        char c[]=word.toCharArray();
6        while(l<r){
7            char temp=c[l];
8            c[l]=c[r];
9            c[r]=temp;
10            l++;
11            r--;
12        }
13        return new String(c);
14    }
15}