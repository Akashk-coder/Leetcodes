class Solution {
    public int[] decompressRLElist(int[] nums) {
     int len=nums.length;
     ArrayList<Integer> ls=new ArrayList<>();
     for(int i=0;i<len;i+=2){
        int val=nums[i];
        int freq=nums[i+1];
        for(int j=0;j<val;j++){
            ls.add(freq);
            }
        }
        int arr[]=new int[ls.size()];
        for(int k=0;k<ls.size();k++){
            arr[k]=ls.get(k);
        }
        return arr;
    }
}