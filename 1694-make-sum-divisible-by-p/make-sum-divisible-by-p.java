class Solution {
    public int minSubarray(int[] nums, int p) {
        int total=0;
        for(int x : nums) total =(total + x ) % p;
        if(total ==0) return 0;
        int need = total;
        int n =  nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefix = 0;
        int ans=n;
        for(int i=0;i<n;i++){
            prefix=(prefix + nums[i]) % p;
            int lf=(prefix - need + p) % p;
            if(map.containsKey(lf)){
                int len = i - map.get(lf);
                if(len<ans) ans=len;
            }
            map.put(prefix,i);
        }
        if(ans == n) return -1;
        return ans;
    }
}