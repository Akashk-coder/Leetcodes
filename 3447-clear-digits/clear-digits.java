class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk=new Stack<>();
        for(char ch : s.toCharArray()){
              if(Character.isDigit(ch)) stk.pop();
              else stk.push(ch);
            }
            StringBuilder sb=new StringBuilder();
            while(!stk.isEmpty()){
             sb.append(stk.pop());
            }
            return sb.reverse().toString();
        }
}