class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) return nums1[i];
            }
        }
        int mins=nums1[0];
        int min2=nums2[0];
        int a=10*mins+min2;
        int b=10*min2+mins;
        return Math.min(a,b);
    }
}