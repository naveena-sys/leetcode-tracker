// Last updated: 7/11/2026, 2:04:31 PM
class Solution {
    public void reverseString(char[] s) { 
        int j=s.length-1;
        for(int i=0;i<s.length;i++){
                 if(j>i){
                  char temp=s[i];
                  s[i]=s[j];
                  s[j]=temp;
                 }
                 j--;
        }
    }
}