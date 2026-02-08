class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n-1] - arr[0];
        int smallest= arr[0]+k;
        int largest= arr[n-1]-k;
        for(int i=1;i<n;i++) {
            if(arr[i] -k <0)
                continue;
            int minHeight=Math.min(smallest,arr[i]-k);
            int maxHeight=Math.max(arr[i-1]+k,largest);
            ans = Math.min(ans,maxHeight-minHeight);
        }
        return ans;
    }
}
