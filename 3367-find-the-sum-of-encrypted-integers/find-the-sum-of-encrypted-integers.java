class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int max=0;
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            count=0;
            max=0;
            while(temp>0){
                int d=temp%10;
                max=Math.max(max,d);
                temp/=10;
            }
            //System.out.print(max);
            while(nums[i]>0){
                int d2=nums[i]%10;
                count++;
                nums[i]/=10;
            }
           int j=0;
           int n=0;
           while(j<count){
            n=n*10+max;
            j++;
           }
           System.out.print(count);
           sum+=n;
        }
        return sum;
    }
}