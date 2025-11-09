class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int max=0, sum=0;
        for(int n : nums){
            freq[n]++;
            max=Math.max(max,freq[n]);
        }
        for(int f : freq){
            if(f==max) sum+=f;
        }
        return sum;
    }
}