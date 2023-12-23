class Solution {
    public static void convertToWave(int n, int[] a) {
        for (int i = 0; i < n; i += 2) {
            if (n == 1) {
                break;
            }
            a[i] = a[i] + a[i + 1];
            a[i + 1] = a[i] - a[i + 1];
            a[i] = a[i] - a[i + 1];
            if (i == (n - 3))
                break;
        }
    }
}