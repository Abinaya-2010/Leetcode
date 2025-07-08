class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while(s.length() < k){
            String a = "";
            for(char ch : s.toCharArray()){
                if(ch == 'z')
                    a += "a";
            a += (char)(ch+1); 
            }
            s += a;
        }
        return s.charAt(k-1);
    }
}