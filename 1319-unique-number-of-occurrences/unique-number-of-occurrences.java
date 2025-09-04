class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> ls=new ArrayList<>();
        for(var v : map.entrySet()){
            if(!ls.contains(v.getValue())) ls.add(v.getValue());
            else return false;
        }
        return true;
    }
}