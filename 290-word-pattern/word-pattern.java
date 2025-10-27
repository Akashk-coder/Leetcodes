class Solution {
    public boolean wordPattern(String pattern, String s) {
     int len=pattern.length();
     String str[]= s.split(" ");
     if(len!=str.length) return false;
     for(int i=0;i<str.length;i++)   {
        if(pattern.indexOf(pattern.charAt(i))!=indofwrd(str,str[i])) return false;
        }
        return true;
    }
    private int indofwrd(String words[],String word){
        for(int i =0 ;i<words.length;i++){
            if(words[i].equals(word)) return i;
        }
        return -1;
    }
}