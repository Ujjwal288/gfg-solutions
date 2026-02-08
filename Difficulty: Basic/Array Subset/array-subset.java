
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        java.util.HashMap<Integer,Integer> map = new java.util.HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++){
            if(!map.containsKey(b[i]) || map.get(b[i])==0){
                return false;
            }
            map.put(b[i], map.get(b[i])-1);
        }
        return true;
    }
}
