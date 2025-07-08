class Solution {
public:
    bool isPalindrome(int x) {
        int rem,temp;
        long long res=0;
        temp=x;
        if(x<0)
        {
            return false;
        }
        while(x!=0){
            rem=x%10;
            res=res*10+rem;
            x/=10;
        }
        if(res==temp)
            return true;
        else
            return false;
        
    }
};