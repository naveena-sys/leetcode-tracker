// Last updated: 7/11/2026, 2:07:52 PM
class Solution {
    public int reverse(int x) {
        int flag=1;
        if(x<0) {
            x=x*(-1);
            flag=-1;
        }
        long y=0;
        while(x!=0)
        {
            y=y*10 + (x%10);
            x/=10;
        }
        y*=flag;
       return(y<Integer.MIN_VALUE || y>Integer.MAX_VALUE)?0:(int)y;

        
        }
        
    }
