class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String s[] = text.split(" ");
        String s1[] = new String[s.length];
        int j=0;
        for(int i=0;i<s.length-2;i++){
            if(s[i].equals(first) && s[i+1].equals(second)){
                s1[j] = s[i+2];
                j++;
            }
        }
         return Arrays.copyOf(s1, j);
    }
}