class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0){
            if(s.charAt(i)==' '){
                break;
            }
            else{
                count++;
            }
            i--;
        }
        return count;
    }
}