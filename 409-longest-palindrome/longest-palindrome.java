class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map. getOrDefault(c,0)+1);
        }
        int length=0;
        boolean odd = false;
        for(int c : map.values()){
            length+=(c/2)*2;
        if(c%2==1){
            odd=true;
            }
        }
        if(odd) length++;
        return length;
    }
}