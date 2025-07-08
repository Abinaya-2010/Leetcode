class Solution {
    public boolean isBalanced(String num) {
        int a[] = new int[num.length()];
        for(int i=0;i<num.length();i++){
            a[i] = num.charAt(i)-'0';
        }
        int s1=0,s2=0;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"\t");
        }
        for(int i=0;i<a.length;i+=2){
            s1 += a[i];
        }
        for(int i=1;i<a.length;i+=2){
            s2 += a[i];
        }
        System.out.println(s1+"\t"+s2);
        if(s1 == s2)
        return true;
        return false;
    }
}