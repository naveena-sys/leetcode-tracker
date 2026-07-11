// Last updated: 7/11/2026, 2:07:45 PM
class Solution
{
    public boolean isPalindrome(int x) 
    {
        int rev=0;
        int temp=x;
        while(temp>0)
        {
            int remainder=temp%10;
            rev=rev*10+remainder;
            temp=temp/10;    
        }
        if(x==rev) 
        {
            return true;
        }
        else{
            return false;
        }
    }
}