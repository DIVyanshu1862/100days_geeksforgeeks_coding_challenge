class Solution {
    static void insert(int arr[], int i) {
        // Your code here
        int k = i - 1;
        arr[k] = arr[k] ^ arr[i];
        arr[i] = arr[k] ^ arr[i];
        arr[k] = arr[k] ^ arr[i];
        k--;
        i--;
        if (k > -1 && arr[k] > arr[i])
            insert(arr, i);
        return;
    }

    public void insertionSort(int arr[], int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            i = j - 1;
            if (arr[i] > arr[j])
                insert(arr, j);
        }
    }
}