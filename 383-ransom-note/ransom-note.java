class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        int frq2[]=new int[26];
        for(char c : ransomNote.toCharArray()){
            freq[c-'a']++;
        }
        for(char ch :magazine.toCharArray()) frq2[ch-'a']++;
        for(int i=0;i<=25;i++){
            if(freq[i]>frq2[i])  return false;
        }
        return true;
    }
}