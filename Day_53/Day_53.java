class Compute {
    static Pair getMinMax(long a[], long n) {
        // Write your code here
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(a[i], max);
            min = Math.min(a[i], min);
        }
        return new Pair(min, max);
    }
}