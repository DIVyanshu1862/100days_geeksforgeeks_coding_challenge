class Solution {
    
    public static int maxsumsubArray(int[] arr, int N){
        int curr = 0;
        int max = arr[0];
        
        for(int i = 0; i < N; i++){
            curr += arr[i];
            if(curr > max) max = curr;
            if(curr < 0) curr = 0;    
        }
        
        return max;
    }
    
    int maximumSumRectangle(int N, int M, int arr[][]) {
        // code here
        int max = maxsumsubArray(arr[0], arr[0].length);
        for(int k = 0; k < N; k++){
            int dummy[] = new int[M];
            for(int i = k; i < N; i++){
                for(int j = 0; j < M; j++){
                    dummy[j] += arr[i][j];
                }
                
                int sum = maxsumsubArray(dummy, M);
                if(sum > max) max = sum;
            }
        }
        return max;
    }
};