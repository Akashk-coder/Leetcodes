class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char ch[]=s.toCharArray();
        String res="";
        for(char ch1 : ch){
            if(ch1>='a' && ch1<='z' || ch1>='0' && ch1<='9'){
                res+=ch1;
            }
        }
        StringBuilder sb=new StringBuilder(res);
        sb.reverse();
        return res.equals(sb.toString());
    }
}