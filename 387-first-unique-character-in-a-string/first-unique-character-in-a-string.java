class Solution {
    public int firstUniqChar(String s) {
        char ch[]=s.toCharArray();
        int freq[]=new int[26];
        for(int i=0;i<ch.length;i++){
            freq[ch[i]-'a']++;
            }
        for(int j=0;j<ch.length;j++){
            if(freq[ch[j]-'a']==1){
                return j;
            }
        }        
        return -1;
    }
}