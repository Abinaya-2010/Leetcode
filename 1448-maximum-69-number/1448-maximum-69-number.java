class Solution {
    public int maximum69Number (int num) {
        String number = String.valueOf(num);
        char c[] = number.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] == '6'){
                c[i] = '9';
                break;
            }
        }
        int a = 0;
        int s=0;

        for(int i=0;i<c.length;i++){
            s=(s*10)+c[i]-'0';
        }
        System.out.println(s);
        return s;
    }
}