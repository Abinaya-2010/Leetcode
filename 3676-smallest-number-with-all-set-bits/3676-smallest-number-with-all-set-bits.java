class Solution {
    public int smallestNumber(int n) {
        int a[] = {1,3,7,15,31,63,127,255,511,1023};
        int l = 0;
        for(int i=0;i<a.length;i++){
            if(n <= a[i]){
                l = a[i];
                break;
            }
        }
        return l;
    }
}