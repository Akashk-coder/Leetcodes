public class Solution{
    public long countFairPairs(int[] nums,int lower,int upper){
        Arrays.sort(nums);
        long ans=0;
        for(int i=0;i<nums.length;i++){
            int lo=lowerBound(nums,lower - nums[i],i+1);
            int hi=lowerBound(nums,upper-nums[i]+1,i+1);
            ans+=hi-lo;
        }
        return ans;
    }
    private int lowerBound(int[] nums,int target,int start){
        int left=start, right=nums.length;
        while(left<right){
            int mid=(left + right) / 2;
            if(nums[mid]>=target) right=mid;
            else left = mid+1;
        }
        return left;
    }
}