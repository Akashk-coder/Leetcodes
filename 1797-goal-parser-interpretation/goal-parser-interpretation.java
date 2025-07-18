class Solution {
    public String interpret(String command) {
        String res="";
        return res=command.replace("()","o").replace("(al)","al");
    }
}