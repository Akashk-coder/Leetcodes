import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};
                          
        HashSet<String> set = new HashSet<>();
        
        for (String match : words) {
            StringBuilder sb = new StringBuilder();
            for (char ch : match.toCharArray()) {
                sb.append(morse[ch - 'a']);
            }
            set.add(sb.toString()); 
        }
        
        return set.size(); 
    }
}
