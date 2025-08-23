class Solution {
    public String reverseWords(String s) {
        String a[] = s.split(" ");
        String s1 = "";
        for(int i=a.length-1;i>=0;i--){
            if(a[i] != "")
                s1 += a[i]+" ";
        }
        return s1.trim();
    }
}