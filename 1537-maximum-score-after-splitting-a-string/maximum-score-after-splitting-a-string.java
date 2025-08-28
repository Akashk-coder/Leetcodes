class Solution {
    public int maxScore(String s) {
        int len=s.length()-1;
        int c=0;
        int c2=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
            for(int j=0;j<len;j++){
                if(s.charAt(j)=='0'){
                    c2++;
                }
                else{
                    c--;
                }
                max=Math.max(max,c+c2);
            }
            // if(s.charAt(i)=='1'){
            //     c2++;
            // }
        return max;
    }
}