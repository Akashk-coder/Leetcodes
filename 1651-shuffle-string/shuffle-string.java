class Solution {
    public String restoreString(String s, int[] indices) {
     //char ch[]=s.toCharArray();
     char ch2[]=new char[s.length()];
     for(int i=0;i<s.length();i++) ch2[indices[i]]=s.charAt(i);
     return new String(ch2);
    }
}