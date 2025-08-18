class Solution {
    public int averageValue(int[] nums) {
        int n=nums.length;
        int ev=0;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                ev+=nums[i];
                c++;
        }
    }
        if(c!=0){
            return ev/c;
        }
        else{
            return 0;
        }
    }
}