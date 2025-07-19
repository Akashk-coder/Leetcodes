class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int count = 0;
        int candidate=0;
        for(int n : nums){
            if(count == 0){
                candidate = n;
            }
            if(n==candidate){
                count++;
            }
            else {
                count--;
            }
        }
            return candidate;
    }
}