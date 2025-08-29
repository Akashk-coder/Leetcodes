class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x1=Integer.MIN_VALUE;
        int x2=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++){
            x1=Math.max(x1,nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            x2=Math.max(x2,nums2[j]);
        }
        // int y=nums2[0]-nums1[0];
        // return y;
        return x2-x1;
    }
}