class Solution {
    public boolean isAnagram(String s, String t) {
        // char ch[]=s.toCharArray();
        // char ch2[]=t.toCharArray();
        // Arrays.sort(ch);
        // Arrays.sort(ch2);
        // return Arrays.equals(ch,ch2);
        if(s.length()!=t.length()) return false;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++){
            freq[t.charAt(j)-'a']--;
         }
         for(int count : freq){
            if(count!=0){
                return false;
            }
         }
            return true;
    }
}