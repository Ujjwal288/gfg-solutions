class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        java.util.Arrays.sort(arr, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        ArrayList<int[]> res = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                res.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        res.add(new int[]{start, end});

        return res;
    }
}