class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int left =0;
        int rigth = arr.length-1;
        while(left<=rigth) {
            int mid = left + (rigth-left)/2;
            if(arr[mid] == k) {
                return mid;
            }
            else if(arr[mid] <k) {
                left = mid+1;
            }
            else {
                rigth = mid-1;
            }
        }
        return left;
    }
}