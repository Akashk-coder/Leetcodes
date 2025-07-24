class Solution {
    public List<Integer> grayCode(int n) {
       int i=1<<n;
       ArrayList<Integer> lst=new ArrayList<>(i);
       for(int j=0;j<i;j++){
        lst.add(j^(j>>1));
       }
       return lst;
    }
}