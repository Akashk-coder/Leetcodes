class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int len1=num1.length();
        int len2=num2.length();
        int i=len1-1;
        int j=len2-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int dig1= i>=0 ? num1.charAt(i)-'0' : 0;
            int dig2= j>=0 ? num2.charAt(j)-'0' : 0;
            int sum=dig1+dig2+carry;
            sb.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}