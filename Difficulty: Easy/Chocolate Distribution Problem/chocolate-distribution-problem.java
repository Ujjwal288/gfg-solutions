class Solution {
    public int findMinDiff(int arr[], int m) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++) {
            int diff = arr[i+m-1] - arr[i];
            mindiff = Math.min(mindiff,diff);
        }
        return mindiff;
    }
}