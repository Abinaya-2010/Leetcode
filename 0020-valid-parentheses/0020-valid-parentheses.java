class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                a.push(s.charAt(i));
            else{
                if(!a.isEmpty()){
                char top = a.peek();
                if(s.charAt(i) == ')' && top == '(')
                    a.pop();
                else if(s.charAt(i) == '}' && top == '{')
                    a.pop();
                else if(s.charAt(i) == ']' && top == '[')
                    a.pop();
                else 
                    return false;
            }
            else
                return false;
            
        }
        }
        return a.isEmpty();
    }
}