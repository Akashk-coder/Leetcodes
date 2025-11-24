class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> bool = new ArrayList<>();
        int ans=0;
        for(int bit : nums){
            ans=(ans * 2 + bit) % 5;
            bool.add(ans==0);
        }
        return bool;
    }
}