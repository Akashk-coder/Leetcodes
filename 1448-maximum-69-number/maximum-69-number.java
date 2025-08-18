class Solution {
    public int maximum69Number (int num) {
        String st=String.valueOf(num);
        st=st.replaceFirst("6","9");
        return Integer.parseInt(st);
    }
}