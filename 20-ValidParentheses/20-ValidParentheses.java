// Last updated: 7/11/2026, 2:07:31 PM
class Solution {
    char arr[];
    int top=-1;    
    public boolean isValid(String s) {
        arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{'){
                push(ch);
            }
            else if(top!=-1){
                char ans=pop();
                if((ch==']' && ans!='[')||(ch==')' && ans!='(')||(ch=='}' && ans!='{')) return false;
            }
            else return false;
        }
        return top==-1;
    }
    public void push(char data){
        top++;
        arr[top]=data;
    }
    public char pop(){
        return arr[top--];
    }
}