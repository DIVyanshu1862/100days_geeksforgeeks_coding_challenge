class Solution {
  int countPairs(int mat1[][], int mat2[][], int n, int x) {
    // code here
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int val = mat1[i][j];
        int k = 0, l = n - 1;
        while (k <= n - 1) {
          if (val + mat2[k][l] == x) {
            cnt++;
            break;
          } else if (val + mat2[k][l] > x) {
            int low = 0, high = n;
            while (low <= high) {
              int mid = (low + high) / 2;
              if (val + mat2[k][mid] == x) {
                cnt++;
                break;
              } else if (val + mat2[k][mid] > x) {
                high = mid - 1;
              } else {
                low = mid + 1;
              }
            }
            break;
          } else {
            k++;
          }
        }
      }
    }
    return cnt;
  }
}
