// Last updated: 7/11/2026, 2:03:15 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            if(count==3){
                return true;
            }
            }else{
                count=0;
            }

        }
        return false;
    }
}