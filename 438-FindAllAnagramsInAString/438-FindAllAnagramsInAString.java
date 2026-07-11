// Last updated: 7/11/2026, 2:04:13 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<=s.length()-n;i++){
            boolean x=is_anagram(i,i+n,s,p);
            if(x) result.add(i);
        }
        return result;
    }    
    static boolean is_anagram(int start,int end,String str,String anagram)
    {
            int[] arr=new int[26];
            for(int i=0;i<anagram.length();i++){
                arr[anagram.charAt(i)-'a']++;
            }
            for(int i=start;i<end;i++){
               arr[str.charAt(i)-'a']--;
            }
            for(int i=0;i<26;i++){
                if(arr[i]!=0)   return false;
            }
            return true;
    }
}