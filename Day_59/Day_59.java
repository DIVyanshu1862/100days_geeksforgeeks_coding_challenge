class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) {
        // Your code here

        long[] fibArray = new long[n];

        if (n >= 1) {
            fibArray[0] = 1;
        }
        if (n >= 2) {
            fibArray[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
        }

        return fibArray;

    }
}