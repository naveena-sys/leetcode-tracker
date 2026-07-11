// Last updated: 7/11/2026, 2:02:50 PM
class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] res = new String[str.length];
        for(String word:str){
            int i=word.charAt(word.length()-1)-'0';
            res[i-1]=word.substring(0,word.length()-1);
        }
        return String.join(" ",res);    
    }
}