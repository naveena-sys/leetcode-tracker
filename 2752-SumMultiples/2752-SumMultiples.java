// Last updated: 7/11/2026, 2:02:09 PM
class Solution {
    public int sumOfMultiples(int n) {
     int sum=0;
     for(int i=0;i<=n;i++){
        if(i%3==0 || i%5==0 || i%7==0){
            sum+=i;
        }
     }
     return sum;   
    }
}