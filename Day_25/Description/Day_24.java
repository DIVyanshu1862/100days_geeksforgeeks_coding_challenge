class Solution {
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int n, int k) {
        // Your code goes here
        sort(arr, arr + n);
        int j = n - 1;
        int sum = 0;
        while (j > 0) {
            if (arr[j] - arr[j - 1] < k) {
                sum += (arr[j] + arr[j - 1]);
                j = j - 2;
            } else {
                j = j - 1;
            }
        }
        return sum;
    }

}
