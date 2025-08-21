class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder sb=new StringBuilder();
       int i=columnNumber;
       while(i>0){
        i--;
        int r=i%26;
        char c = (char)('A' + r);
        sb.append(c);
        i/=26;
       }
       return sb.reverse().toString();
    }
}