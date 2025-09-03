class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int count=0;
        for(int i=0;i<=n;i++){
           int res=i;
            count=0;
        while(res>0){
            if((res&1)==1) count++;
            res=res>>1;
            }
            ans[i]=count;
        }
        return ans;
    }
}