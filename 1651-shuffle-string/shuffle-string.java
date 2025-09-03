class Solution {
    public String restoreString(String s, int[] indices) {
     char ch[]=s.toCharArray();
     char ch2[]=new char[indices.length];
     for(int i=0;i<indices.length;i++) ch2[indices[i]]=ch[i];
     return new String(ch2);
    }
}