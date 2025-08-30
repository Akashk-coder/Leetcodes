class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //      if(nums[i]>9){
        //         String s=Integer.toString(nums[i]);
        //         for(int j=0;j<s.length();j++){
        //            int dig=s.charAt(j)-'0';
        //            ls.add(dig);
        //         }
        //      }
        //      else{
        //         ls.add(nums[i]);
        //      }
        // }
        for(int i : nums){
            String a=String.valueOf(i);
            for(char c : a.toCharArray()){
                int dig=c-'0';
                ls.add(dig);
            }
        }
        int arr[]=new int[ls.size()];
        for(int j=0;j<ls.size();j++){
            arr[j]=ls.get(j);
        }
        return arr;
    }
}