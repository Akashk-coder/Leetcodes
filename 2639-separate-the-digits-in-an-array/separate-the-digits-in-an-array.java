class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
             if(nums[i]>9){
                String s=Integer.toString(nums[i]);
                for(int j=0;j<s.length();j++){
                   int dig=s.charAt(j)-'0';
                   ls.add(dig);
                }
             }
             else{
                ls.add(nums[i]);
             }
        }
        int arr[]=new int[ls.size()];
        int c=0;
        for(int i : ls) arr[c++]=i;
        return arr;
    }
}