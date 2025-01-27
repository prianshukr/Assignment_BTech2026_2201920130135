class Solution {
    public boolean isValid(String s) {
       Stack <Character> st = new Stack<>();
       for(char c: s.toCharArray()){
        if(c=='(' || c=='[' || c=='{') st.push(c);
        else{
            if(st.isEmpty()) return false;
            else{
                char ch = st.pop();
                if((ch=='(' && c==')') || (ch=='[' && c==']') || (ch=='{' && c=='}'))continue;
                else return false;
            }
        }
       } 
       return st.isEmpty();
    }
}
