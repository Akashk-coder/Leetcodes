class Solution {
    public int smallestIndex(int[] nums) {
        int len=nums.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum=0;
            while(nums[i]>0){
                int dig=nums[i]%10;
                sum+=dig;
                nums[i]/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}