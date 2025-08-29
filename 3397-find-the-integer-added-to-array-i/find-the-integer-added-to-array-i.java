class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x=0;
        // for(int i=0;i<nums1.length;i++){
        //     x=Math.min(x,nums1[i]);
        // }
        // int y=nums2[nums2.length];
        // for(int j=0;j<nums2.length;j++){
        //     y=Math.min(y,nums2[j]);
        // }
        // int n=x-y;
        x=nums2[0]-nums1[0];
        return x;
    }
}