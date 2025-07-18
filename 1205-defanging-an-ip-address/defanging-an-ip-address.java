class Solution {
    public String defangIPaddr(String address) {
        String res="";
        for(char ch : address.toCharArray()){
            if(ch=='.'){
                res+="[.]";
            }
            else{
                res+=ch;
            }
        }
        return res;
    }
}