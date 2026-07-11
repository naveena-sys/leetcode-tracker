// Last updated: 7/11/2026, 2:04:37 PM
class Solution {
    public boolean isPowerOfThree(int n) {
      if(n==1){
        return true;
      }
      if(n==0 || n%3!=0){
        return false;
      } return isPowerOfThree(n/3);
    } 
    
}
