class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String arr[]=text.split(" ");
        ArrayList<String> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i+2<arr.length && first.equals(arr[i]) && second.equals(arr[i+1])) ls.add(arr[i+2]);
        }
        return ls.toArray(new String[0]);
        // String st[]=new String[ls.size()];
        // for(int i=o;){
        //     ls.add(s);
        // }
        // return 
    }
}