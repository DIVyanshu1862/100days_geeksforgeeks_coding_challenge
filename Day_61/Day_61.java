class Solution {
    static long sumMatrix(long n, long q) {
        if(q > 2*n) return 0;
        long x = (2 + 2*n)/2;
        return n-Math.abs(x - q);
    }
};
