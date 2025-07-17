class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int found=0;
        while(low<=high){
            int mid=(low+high)/2;
            long sqlong=(long)mid*mid;
            if(sqlong==x){
                return mid;
            }
            else if(x<sqlong){
                high=mid-1;
            }
            else{
                found=mid;
                low=mid+1;
            }
        }
        return found;
    }
}