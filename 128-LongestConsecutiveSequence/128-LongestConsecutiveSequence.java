// Last updated: 7/11/2026, 2:05:52 PM
class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        Arrays.sort(arr);
        int curr_c=1,max_count=0;
        for(int i=1;i<arr.length; i++){
            if(arr[i]==arr[i-1]) continue;
            if(arr[i]-1==arr[i-1]) curr_c++;
            else{
                max_count=Math.max(max_count,curr_c);
                curr_c=1;
            }
        }return Math.max(max_count,curr_c);
    }
}