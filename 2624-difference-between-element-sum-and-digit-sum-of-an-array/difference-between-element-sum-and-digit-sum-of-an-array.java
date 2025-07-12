class Solution {
    public int differenceOfSum(int[] nums) {
        int l=nums.length;
        int sum=0;
        int dig=0;
        int sum1=0;
        for(int i=0;i<l;i++){
            sum+=nums[i];
            while(nums[i]>0){
                int dig1=nums[i]%10;
                sum1+=dig1;
                nums[i]/=10;
            }
        }
        return sum-sum1;
    }
}