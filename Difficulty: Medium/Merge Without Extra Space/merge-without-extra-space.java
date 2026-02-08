class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;

        int gap = (n + m + 1) / 2;

        while (gap > 0) {

            int i = 0;
            int j = gap;

            while (j < n + m) {

                if (j < n && a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                else if (j >= n && i < n && a[i] > b[j - n]) {
                    int temp = a[i];
                    a[i] = b[j - n];
                    b[j - n] = temp;
                }

                else if (j >= n && i >= n && b[i - n] > b[j - n]) {
                    int temp = b[i - n];
                    b[i - n] = b[j - n];
                    b[j - n] = temp;
                }

                i++;
                j++;
            }

            if (gap == 1)
                gap = 0;
            else
                gap = (gap + 1) / 2;
        }
    }
}

