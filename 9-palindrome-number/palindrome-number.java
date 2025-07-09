class Solution {
    public boolean isPalindrome(int x) {
        int dp=x;
        if(x<0) return false;
        int rev=0;
        int count=0;
        while(dp>0){
            int dig=dp%10;
            rev=rev*10+dig;
            dp=dp/10;
        }
       return (x==rev);
    }
}