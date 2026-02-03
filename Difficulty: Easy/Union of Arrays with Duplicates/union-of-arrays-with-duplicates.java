class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> unionSet = new HashSet <>();
        for(int x : a) {
            unionSet.add(x);
        }
        for(int y : b) {
            unionSet.add(y);
        }
        ArrayList<Integer> result = new ArrayList <>(unionSet);
        Collections.sort(result);
        return result;
    }
}