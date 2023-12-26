class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int i = 1;
        int max = 0;
        if (arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }
        while (i >= 1 && i <= n - 2) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
