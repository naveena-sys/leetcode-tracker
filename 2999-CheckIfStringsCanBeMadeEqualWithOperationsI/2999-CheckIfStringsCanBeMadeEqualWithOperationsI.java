// Last updated: 7/11/2026, 2:02:00 PM
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        for(int i=0;i<2;i++){
            char[] temp=s1.toCharArray();
            char t=temp[i];
            temp[i]=temp[i+2];
            temp[i+2]=t;
            String s=new String(temp);
            if(s.equals(s2)) return true;
        }
        char[] temp=s1.toCharArray();
        for(int i=0;i<2;i++){ 
            char t=temp[i];
            temp[i]=temp[i+2];
            temp[i+2]=t;
            String s=new String(temp);
            if(s.equals(s2)) return true;
        }
        return false;
    }
}