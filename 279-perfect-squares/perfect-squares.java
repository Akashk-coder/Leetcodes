class Solution {
    public int numSquares(int n) {
        int dup[]=new int[n+1];
        Arrays.fill(dup,Integer.MAX_VALUE);
        dup[0]=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j*j<=i;j--){
        int square = j*j;
        dup[i]=Math.min(dup[i],dup[i-square]+1);
       }
    }
       return dup[n];
    }
}