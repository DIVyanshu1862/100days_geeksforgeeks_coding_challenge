class Solution {
    int missingNumber(int array[], int n) {
        int sum = n * (n + 1) / 2;
        int arsum = 0;
        for (int i = 0; i < n - 1; i++) {
            arsum = array[i] + arsum;
        }
        return sum - arsum;
    }

}