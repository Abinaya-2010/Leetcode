class Solution {
    public long minimumSteps(String s) {
        int black = 0;
        long  ans = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == '0')
                black++;
            else
                ans += black;
        }
        return ans;
    }
}