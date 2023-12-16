class Solution {
    public:
    //Function to find all elements in array that appear more than n/k times.
    int countOccurence(int arr[], int n, int k) {
        int count=0,nbyk=n/k;
        unordered_map<int, int> m; 
        for(int i=0 ; i< n ; i++)
        {
            m[arr[i]]++;
            if(m[arr[i]]>nbyk)
            {
                m[arr[i]]=INT_MIN;
            count++; 
            }
            
        }
        return count;
    }
};